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
import data.Drink;
import data.Item;


public class JpaManager {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	private static JpaManager jpa;
	
	public static JpaManager getInstance() {
		if(jpa == null){
			return new JpaManager();
		} else {
			return jpa;
		}
	}
	
	private JpaManager() {
		emf = Persistence.createEntityManagerFactory("CafeteriaServer");
		em = emf.createEntityManager();
	}
	
	public List<Category> getCategories() {
		Query query = em.createQuery("select c from Category c");
		Vector<Category> categories = (Vector<Category>)query.getResultList();
		System.out.println(categories.get(0).getTitle());
		return categories;	
	}
	
	public List<Drink> getDrinksList() {
		Query query = em.createQuery("select d from Drink d");
		Vector<Drink> drinks = (Vector<Drink>)query.getResultList();
		return drinks;	
	}
	
	public Customer isUserExist( String email,String password ) {	
		Query query = em.createQuery("select c from Customer c where c.email = :email and c.password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		Customer c = null;
		try{
		c = (Customer)query.getSingleResult();
		} catch ( NoResultException e ) {
			return null;
		}
		return c;
	}
	
	public boolean insertUser( Customer customer ) {
		em.getTransaction().begin();		
		em.persist(customer);
		em.getTransaction().commit();
		
		if(em.contains(customer)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void insertCategory( String title ) {
		em.getTransaction().begin();
		
		Category category = new Category(title);
		
		em.persist(category);
		em.getTransaction().commit();
	}
	
//	private void insertItem( String title, double price, boolean isStandAlone, Category category ) {
//		em.getTransaction().begin();
//		
//		Item item = new Item();
//		item.setTitle(title);
//		item.setPrice(price);
//		item.setStandAlone(isStandAlone);
//		//item.setCategory(category);
//		
//		em.persist(item);
//		em.getTransaction().commit();
//	}
	
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
	}
}
