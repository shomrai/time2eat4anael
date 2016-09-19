package db;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sun.swing.PrintingStatus;
import data.Category;
import data.Customer;
import data.Item;


public class JpaManager {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	
	public JpaManager() {
		emf = Persistence.createEntityManagerFactory("CafeteriaServer");
		em = emf.createEntityManager();
	}
	
	public List<Category> getCategories() {
		Query query = em.createQuery("select c from Category c");
		Vector<Category> categories = (Vector<Category>)query.getResultList();
		return categories;	
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
	
	public boolean isCustomerExist( Customer customer ) {
		String email = customer.getEmail();
		String password = customer.getPassword();
		
		Query query = em.createQuery("select c from Customer c where c.email = :email and c.password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		try{
		Customer c = (Customer)query.getSingleResult();
		} catch ( NoResultException e ) {
			return false;
		}
		return true;
		
	}
	
	public static void main ( String [] args ) {
		JpaManager jpa = new JpaManager();
		Customer customer = new Customer();
		customer.setEmail("shira@elitzur.net");
		customer.setPassword("123456");
		boolean ok = jpa.isCustomerExist(customer);
		if(ok) {
			System.out.println("Good User");
		} else {
			System.out.println("Bad User");
		}
		customer = new Customer();
		customer.setEmail("shira@gmail.net");
		customer.setPassword("123456");
		ok = jpa.isCustomerExist(customer);
		if(ok) {
			System.out.println("Good User");
		} else {
			System.out.println("Bad User");
		}
//		jpa.insertCategory("Hot Drinks");
//		jpa.insertCategory("Cold Drinks");
//		jpa.insertCategory("Salads");
//		jpa.insertCategory("Meat");
//		Category cat = jpa.getCategory();
//		jpa.insertItem("Big Coffee", 10, true, cat);
//		jpa.printItemsInCat(cat);
//		jpa.insertItem("Small Coffee", 6, true, cat);
//		jpa.insertItem("Tea", 2, true, cat);
//		jpa.printItemsInCat(cat);
	}
}
