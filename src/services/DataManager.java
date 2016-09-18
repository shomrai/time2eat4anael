package services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import data.Category;
import data.Customer;
import data.Item;
import data.Meal;
import db.JpaManager;

@Path("/data")
public class DataManager {

	private JpaManager jpa = new JpaManager();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/isCustomerExist")
	public String isCustomerExist( @QueryParam("email") String email, @QueryParam("pass") String password ){
		
		//Gson gson = new Gson();
		Customer c = new Customer();
		c.setEmail(email);c.setPassword(password);
//		c.setEmail("shira@elitzur.net");
//		c.setPassword("123456");
		boolean ok = jpa.isCustomerExist(c);
		if(ok) {
			return "ok 6";
		} else {
			return "notOk";
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getCategories")
	public String getCategories() {
		Gson json = new Gson();
		ArrayList<Category> categories = new ArrayList<>();
        Category cat = new Category();
        cat.setTitle("בשרי");
        cat.setDescription("ארוחות בשריות מושקעות");
        // init items in category
        List<Item> items = new ArrayList<>();
        Item item = new Item();
        item.setTitle("שניצל");
        //item.setMeal(true);
        // init meals related to this item
        Meal meal = new Meal();
        meal.setTitle("שניצל בצלחת");
        //item.addMeal(meal);
        meal = new Meal();
        meal.setTitle("שניצל בבאגט");
        //item.addMeal(meal);
        meal = new Meal();
        meal.setTitle("שניצל בפיתה");
        //item.addMeal(meal);
        items.add(item);

        item = new Item();
        item.setTitle("המבורגר");
        //item.setMeal(true);
        // init meals related to this item
        meal = new Meal();
        meal.setTitle("המבורגר בצלחת");
        //item.addMeal(meal);
        meal = new Meal();
        meal.setTitle("המבורגר בבאגט");
        //item.addMeal(meal);
        meal = new Meal();
        meal.setTitle("המבורגר בפיתה");
        //item.addMeal(meal);
        items.add(item);

        item = new Item();
        item.setTitle("פרגית");
        //item.setMeal(true);
        // init meals related to this item
        meal = new Meal();
        meal.setTitle("פרגית בצלחת");
        //item.addMeal(meal);
        meal = new Meal();
        meal.setTitle("פרגית בבאגט");
        //item.addMeal(meal);
        meal = new Meal();
        meal.setTitle("פרגית בפיתה");
        //item.addMeal(meal);
        items.add(item);

        item = new Item();
        item.setTitle("לאפה שווארמה");
        //item.setMeal(false);
        items.add(item);

        // add items to category
        cat.setItems(items);


        categories.add(cat);
        cat = new Category();
        cat.setTitle("חלבי");
        cat.setDescription("ארוחות חלביות מדהימות");
        categories.add(cat);
        cat = new Category();
        cat.setTitle("סלטים");
        cat.setDescription("מבחר סלטים בהרכבה");
        categories.add(cat);
        cat = new Category();
        cat.setTitle("שתיה חמה");
        cat.setDescription("כל סוגי השתייה החמה");
        categories.add(cat);
        cat = new Category();
        cat.setTitle("מאפים");
        cat.setDescription("כל סוגי המאפים");
        categories.add(cat);
        cat = new Category();
        cat.setTitle("שתיה קרה");
        cat.setDescription("כל סוגי השתיה הקרה");
        categories.add(cat);
        cat = new Category();
        cat.setTitle("חטיפים");
        cat.setDescription("במבה,ביסלי,פסק זמן...");
        categories.add(cat);
        
        
		return json.toJson(categories.toArray());
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getHello")
	public String getHello() {
		return "hello";
	}
}
