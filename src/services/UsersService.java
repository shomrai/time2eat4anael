package services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.xml.internal.bind.v2.TODO;

import data.Customer;
import db.JpaManager;

@Path("/users")
public class UsersService {

	
	private JpaManager jpa = JpaManager.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/isUserExist")
	public String isUserExist( @QueryParam("email") String email, @QueryParam("pass") String password ){
		
		Customer c = jpa.isUserExist(email,password);
		Gson json = new Gson();
		return json.toJson(c);
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/insertUser")
	public String insertUser( InputStream input ) {
		// to get the json from the client i receive in this method the input stream and build the json string
		StringBuilder jsonUser = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			String line = null;
			while ((line = in.readLine()) != null) {
				jsonUser.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}
		// with Gson i convert the json to Customer object
		Gson gson = new Gson();
		Customer c = gson.fromJson(jsonUser.toString(), Customer.class);
		System.out.println(c.getFirstName());
		boolean result = jpa.insertUser(c);
		if(result) {
			return "OK";
		} else {
			return "notOk";
		}
		// **** Fix the return value to boolean or json !!
//		JsonObject jsonObject = new JsonObject();
//		jsonObject.addProperty("result", );
//		return jsonObject;
	}
}
