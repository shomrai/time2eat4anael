import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sun.swing.PrintingStatus;
import data.Category;
import data.Item;


public class JpaManager {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	
	public JpaManager() {
		emf = Persistence.createEntityManagerFactory("CafeteriaServer");
		em = emf.createEntityManager();
	}
	

	
	private void insertCategory( String title ) {
		em.getTransaction().begin();
		
		Category category = new Category(title);
		
		em.persist(category);
		em.getTransaction().commit();
	}
	
	private void insertItem( String title, double price, boolean isStandAlone, Category category ) {
		em.getTransaction().begin();
		
		Item item = new Item();
		item.setTitle(title);
		item.setPrice(price);
		item.setStandAlone(isStandAlone);
		item.setCategory(category);
		
		em.persist(item);
		em.getTransaction().commit();
	}
	
	private Category getCategory() {
		Query query = em.createQuery("select c from Category c where c.title = 'Hot Drinks'");
		Category category = (Category)query.getSingleResult();
		return category;
	}
	
	private void printItemsInCat( Category c ) {
		Query query = em.createQuery("select i from Item i where i.category = :c");
		query.setParameter("c",c);
		List<Item> items = query.getResultList();
		for( Item item : items ) {
			System.out.println(item.getTitle());
		}
	}
	
	public static void main ( String [] args ) {
		JpaManager jpa = new JpaManager();
		jpa.insertCategory("Hot Drinks");
		jpa.insertCategory("Cold Drinks");
		jpa.insertCategory("Salads");
		jpa.insertCategory("Meat");
		Category cat = jpa.getCategory();
		jpa.insertItem("Big Coffee", 10, true, cat);
		jpa.printItemsInCat(cat);
		jpa.insertItem("Small Coffee", 6, true, cat);
		jpa.insertItem("Tea", 2, true, cat);
		jpa.printItemsInCat(cat);
	}
}
