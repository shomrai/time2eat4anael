package data;

import javax.persistence.Entity;

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
	private boolean isStandAlone = true;

}
