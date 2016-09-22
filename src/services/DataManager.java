package services;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import data.Category;
import data.Customer;
import data.DataHolder;
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
			return "ok";
		} else {
			return "notOk";
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getCategories")
	public String getCategories() {
		Gson json = new Gson();
		List<Category> categories = new ArrayList<>();
//		categories = DataHolder.getInstance().getCategories();
		categories = jpa.getCategories();
		//System.out.println(categories.get(0).getTitle());
		return json.toJson(categories.toArray());
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getHello")
	public String getHello() {
		return "hello";
	}
	
	
}
