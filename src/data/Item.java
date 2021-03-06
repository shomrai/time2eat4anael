package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Shira Elitzur
 * 
 * An instance of this class represent A single item from the cafeteria menu
 *
 */
@Entity
@Table (name = "items")
public class Item {
	
	/**
	 * The id of this item (auto generated by db)
	 */
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( name = "Id", nullable=false)
	private int id;
	
	/**
	 * The title of this item.
	 * 1-3 words that describes the item
	 */
	@Column( name = "Title", nullable=false, length=30)
	private String title;
	
//	/**
//	 * An indication if this item is for sale as is or only as part of a meal
//	 */
//	@Column( name = "Is_Stand_Alone", nullable=false)
//	private boolean isStandAlone;
	
	/**
	 * The price of this item (only for stand alone item)
	 */
	@Column( name = "Price", nullable=true)
	private double price;
	
//	/**
//	 * The category of this item (food category like drinks, salads...)
//	 */
//	@ManyToOne // One Category can have many items. Item can have only one Category
//	@JoinColumn( name = "Category_Id")
//	private Category category;
	
	
	/**
	 * Returns the id of this item
	 * @return the id of this item
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id for this item
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the title of this item
	 * @return the title of this item
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets title to this item
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

//	/**
//	 * Retruns true if this item is for sale as is or false if it is only part of a meal
//	 * @return true if this item is for sale as is
//	 */
//	public boolean isStandAlone() {
//		return isStandAlone;
//	}
//
//	/**
//	 * Sets if this item is for sale as is or only as part of a meal
//	 * @param isStandAlone
//	 */
//	public void setStandAlone(boolean isStandAlone) {
//		this.isStandAlone = isStandAlone;
//	}

	/**
	 * Returns the price of this item
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets price for this item
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

//	/**
//	 * Returns the category of this item
//	 * @return the category of this item
//	 */
//	public Category getCategory() {
//		return category;
//	}
//
//	/**
//	 * Sets category object for this item
//	 * @param category
//	 */
//	public void setCategory(Category category) {
//		this.category = category;
//	}

}
