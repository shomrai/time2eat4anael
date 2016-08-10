package data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Shira Elitzur
 * 
 * An instance of this class represents Main item - the main part of a Meal object
 *
 */
@Entity
public class Main extends Item {

	/**
	 * Item can stand alone or not but Main can not so i hide the super class field
	 */
	private boolean isStandAlone = false;
	
	
}
