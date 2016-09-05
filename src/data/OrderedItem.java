//package data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
///**
// * 
// * @author Shira Elitzur
// * 
// * An instance of this class represent an ordered item from a specific order
// *
// */
//@Entity
//@Table(name = "ordered_items")
//public class OrderedItem {
//	
//	/**
//	 * The id of this ordered item (auto generated by db)
//	 */
//	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column( name = "Id", nullable=false)
//	private int id;
//	
//	/**
//	 * The item in the menu that this ordered item is an actual instance of
//	 * 
//	 */
//	@ManyToOne // OrderedItem has a Unidirectional ManyToOne relationship with Item. From OrderedItem i can know who is my Item but in Item i don't have list of orderedItems
//	@JoinColumn( name = "Item_Id" )
//	private Item parentItem;
//	
//	/**
//	 * The customer can attach comment to the ordered item
//	 */
//	@Column( name = "Comment", nullable=true, length=5000)
//	private String comment;
//
//	/**
//	 * The parent-order of this ordered item
//	 */
//	@ManyToOne // Bidirectional ManyToOne relationship ( Order has a list of OrderItem )
//	@JoinColumn( name = "Order_Id" )
//	private Order order;
//	
//	/**
//	 * 
//	 */
//	@ManyToOne // OrderedItem can have only one OrderedMeal, OrderedMeal can have many OrderedItem(s). Bidirectional ( OrderedMeal has list of OrderedItem )
//	@JoinColumn( name = "Meal_Id")
//	private OrderedMeal meal;
//	
//	/**
//	 * Returns the id of this ordered item
//	 * @return the id of this ordered item
//	 */
//	public int getId() {
//		return id;
//	}
//
//	/**
//	 * Sets id for this ordered item
//	 * @param id
//	 */
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	/**
//	 * Returns the Item that is this orderer-item parent
//	 * @return the parent item
//	 */
//	public Item getParentItem() {
//		return parentItem;
//	}
//
//	/**
//	 * Sets item as parent item for this ordered item
//	 * @param parentItem
//	 */
//	public void setParentItem(Item parentItem) {
//		this.parentItem = parentItem;
//	}
//
//	/**
//	 * Returns the comment that the customer attached to the item
//	 * @return comment that was attached to the item
//	 */
//	public String getComment() {
//		return comment;
//	}
//
//	/**
//	 * Sets a comment to the ordered item ( customer comment. example:
//	 * "Not too hot")
//	 * @param comment
//	 */
//	public void setComment(String comment) {
//		this.comment = comment;
//	}
//
//	/**
//	 * Returns the order object of this ordered item
//	 * @return the order object of the item
//	 */
//	public Order getOrder() {
//		return order;
//	}
//
//	/**
//	 * Sets order object to this item
//	 * @param order
//	 */
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//	
//}