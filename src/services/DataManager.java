package services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import data.Category;
import data.Item;
import db.JpaManager;

@Path("/data")
public class DataManager {

	//private JpaManager jpa = new JpaManager();
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/getCategories")
//	public String getCategories() {
//		Gson json = new Gson();
//		ArrayList<Category> categories = jpa.getCategories();
//		return json.toJson(categories.toArray());
//	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getHello")
	public String getHello() {
		return "hello";
	}
}
