package data;

import javax.persistence.Entity;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Shira Elitzur
 * 
 * An instance of this class represents Drink item.
 * 
 */
@Entity
public class Drink extends Item {
	
	/**
	 * Item can stand alone or not but Drink always can, so i hide the super class field
	 */
	@SerializedName(value = "drinkIsStandAlone")
	private boolean isStandAlone = true;

}
