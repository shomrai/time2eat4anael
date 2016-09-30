package data;
import java.util.ArrayList;
import java.util.List;


public class DataHolder {
	
	private static DataHolder theData;
	private List<Category> categories;
	
	private DataHolder() {
		//initCategories();
	}
	
	public static DataHolder getInstance() {
		if( theData == null ) {
			return new DataHolder();
		} else {
			return theData;
		}
	}
	
	public List<Category> getCategories(){
        return categories;
	}
	
//	private void initCategories() {
//		categories = new ArrayList<>();
//        Category cat = new Category();
//        cat.setTitle("בשרי");
//        cat.setDescription("ארוחות בשריות מושקעות");
//        // init items in category
//        List<Item> items = new ArrayList<>();
//        List<Meal> meals = new ArrayList<>();
//        Meal meal = new Meal();
//        Main main = new Main();
//        Item item = new Item();
//        List<Drink> drinks = new ArrayList<>();
//        Drink drink = new Drink();
//        drink.setTitle("קוקה קולה");
//        drink.setPrice(7.5);
//        drinks.add(drink);
//        drink = new Drink();
//        drink.setTitle("פאנטה");
//        drink.setPrice(7.5);
//        drinks.add(drink);
//        drink = new Drink();
//        drink.setTitle("ענבים");
//        drink.setPrice(6.5);
//        drinks.add(drink);
//        drink = new Drink();
//        drink.setTitle("ספרייט");
//        drink.setPrice(7.5);
//        drinks.add(drink);
//
//        List<Item> extras = new ArrayList<Item>();
//        Item extra = new Item();
//        extra.setTitle("אורז");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("צ'יפס");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("ירקות");
//        extra.setPrice(5);
//        extras.add(extra);
//
//        item.setTitle("שניצל");
//        item.setStandAlone(false);
//        meal.setTitle("שניצל בצלחת");
//        meal.setExtraAmount(2);
//        meal.setExtras(extras);
//        meal.setDrinkOptions(drinks);
//        meal.setPrice(35.66657);
//        main.setTitle("שניצל");
//        meal.setMain(main);
//        meals.add(meal);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("חומוס");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חריף");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("טחינה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חמוצים");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("כרוב סגול");
//        extra.setPrice(5);
//        extras.add(extra);
//        
//        meal = new Meal();
//        meal.setTitle("שניצל בבאגט");
//        main = new Main();
//        main.setTitle("שניצל");
//        meal.setMain(main);
//        meal.setPrice(35.66657);
//        meal.setExtras(extras);
//        meals.add(meal);
//        
//        meal = new Meal();
//        meal.setTitle("שניצל בפיתה");
//        main = new Main();
//        main.setTitle("שניצל");
//        meal.setMain(main);
//        meal.setPrice(15.5);
//        meal.setExtras(extras);
//        meals.add(meal);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("אורז");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("צ'יפס");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("ירקות");
//        extra.setPrice(5);
//        extras.add(extra);
//        
//        items.add(item);
//
//        item = new Item();
//        item.setTitle("המבורגר");
//        item.setStandAlone(false);
//        meal = new Meal();
//        meal.setTitle("המבורגר בצלחת");
//        main = new Main();
//        main.setTitle("המבורגר");
//        meal.setMain(main);
//        meal.setPrice(32.5);
//        meal.setExtras(extras);
//        meals.add(meal);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("חומוס");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חריף");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("טחינה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חמוצים");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("כרוב סגול");
//        extra.setPrice(5);
//        extras.add(extra);
//        
//        meal = new Meal();
//        meal.setTitle("המבורגר בבאגט");
//        main = new Main();
//        main.setTitle("המבורגר");
//        meal.setMain(main);
//        meal.setPrice(16);
//        meal.setExtras(extras);
//        meals.add(meal);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("חומוס");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חריף");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("טחינה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חמוצים");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("כרוב סגול");
//        extra.setPrice(5);
//        extras.add(extra);
//        
//        meal = new Meal();
//        meal.setTitle("המבורגר בפיתה");
//        main = new Main();
//        main.setTitle("המבורגר");
//        meal.setMain(main);
//        meal.setPrice(17.6);
//        meal.setExtras(extras);
//        meals.add(meal);
//        items.add(item);
//
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("אפונה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("תפוחי אדמה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("שעועית");
//        extra.setPrice(5);
//        extras.add(extra);
//        
//        
//        item = new Item();
//        item.setTitle("פרגית");
//        item.setStandAlone(false);
//        meal = new Meal();
//        meal.setTitle("פרגית בצלחת");
//        main = new Main();
//        main.setTitle("פרגית");
//        meal.setMain(main);
//        meal.setPrice(37);
//        meal.setExtraAmount(2);
//        meal.setExtras(extras);
//        meals.add(meal);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("חומוס");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חריף");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("טחינה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("חמוצים");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("כרוב סגול");
//        extra.setPrice(5);
//        extras.add(extra);
//        
//        meal = new Meal();
//        meal.setTitle("פרגית בבאגט");
//        main = new Main();
//        main.setTitle("פרגית");
//        meal.setMain(main);
//        meal.setPrice(22);
//        meal.setExtras(extras);
//        meals.add(meal);
//        
//        meal = new Meal();
//        meal.setTitle("פרגית בפיתה");
//        main = new Main();
//        main.setTitle("פרגית");
//        meal.setMain(main);
//        meal.setPrice(18);
//        meal.setExtras(extras);
//        meals.add(meal);
//        items.add(item);
//
//
//        // set items and meals to category
//        cat.setItems(items);
//        cat.setMeals(meals);
//        categories.add(cat);
//        
//        items = new ArrayList<>();
//        
//        cat = new Category();
//        cat.setTitle("חלבי");
//        cat.setDescription("ארוחות חלביות מדהימות");
//        item = new Item();
//        item.setTitle("טוסט");
//        item.setStandAlone(false);
//        items.add(item);
//        meals = new ArrayList<>();
//        meal = new Meal();
//        meal.setTitle("טוסט מיוחד");
//        main = new Main();
//        main.setTitle("טוסט");
//        meal.setMain(main);
//        meal.setPrice(15);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("עגבניה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("רוטב פיצה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("בצל");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("זיתים");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("רוטב שום");
//        extra.setPrice(5);
//        extras.add(extra);
//        meal.setExtras(extras);
//        meals.add(meal);
//        cat.setItems(items);
//        cat.setMeals(meals);
//        categories.add(cat);
//        
//        cat = new Category();
//        cat.setTitle("סלטים");
//        cat.setDescription("מבחר סלטים בהרכבה");
//        
//        meals = new ArrayList<>();
//        items = new ArrayList<>();
//        item = new Item();
//        item.setTitle("סלט");
//        items.add(item);
//        meal = new Meal();
//        main = new Main();
//        main.setTitle("סלט");
//        meal.setTitle("סלט חסה");
//        meal.setMain(main);
//        meal.setPrice(15);
//        
//        extras = new ArrayList<Item>();
//        extra = new Item();
//        extra.setTitle("עגבניה");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("מלפפון");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("בצל");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("פטריות");
//        extra.setPrice(5);
//        extras.add(extra);
//        extra = new Item();
//        extra.setTitle("טונה");
//        extra.setPrice(5);
//        extras.add(extra);
//        meal.setExtras(extras);
//        meals.add(meal);
//        cat.setMeals(meals);
//        
//        cat.setItems(items);
//        categories.add(cat);
//        
//        cat = new Category();
//        cat.setTitle("שתיה חמה");
//        cat.setDescription("כל סוגי השתייה החמה");
//        List<Item> hotDrinks = new ArrayList<>();
//        item = new Item();
//        item.setTitle("קפה גדול");
//        item.setPrice(7);
//        item.setStandAlone(true);
//        hotDrinks.add(item);
//        item = new Item();
//        item.setTitle("קפה קטן");
//        item.setPrice(5);
//        item.setStandAlone(true);
//        hotDrinks.add(item);
//        item = new Item();
//        item.setTitle("קפה שחור");
//        item.setPrice(4);
//        item.setStandAlone(true);
//        hotDrinks.add(item);
//        item = new Item();
//        item.setTitle("תה");
//        item.setPrice(2);
//        item.setStandAlone(true);
//        hotDrinks.add(item);
//        cat.setItems(hotDrinks);
//        categories.add(cat);
//        
//        cat = new Category();
//        cat.setTitle("מאפים");
//        cat.setDescription("כל סוגי המאפים");
//        
//        List<Item> bakes = new ArrayList<>();
//        item = new Item();
//        item.setTitle("קוראסון");
//        item.setPrice(6);
//        bakes.add(item);
//        item = new Item();
//        item.setTitle("רוגלך");
//        item.setPrice(4);
//        bakes.add(item);
//        item = new Item();
//        item.setTitle("בורקס");
//        item.setPrice(5);
//        bakes.add(item);
//        cat.setItems(bakes);
//        categories.add(cat);
//        cat = new Category();
//        cat.setTitle("חטיפים");
//        cat.setDescription("במבה,ביסלי,פסק זמן...");
//        List<Item> snacks = new ArrayList<>();
//        item = new Item();
//        item.setTitle("במבה גדולה");
//        item.setPrice(7);
//        snacks.add(item);
//        item = new Item();
//        item.setTitle("במבה קטנה");
//        item.setPrice(5);
//        snacks.add(item);
//        item = new Item();
//        item.setTitle("ביסלי");
//        item.setPrice(5);
//        snacks.add(item);
//        item = new Item();
//        item.setTitle("מיני פסק זמן");
//        item.setPrice(4.5);
//        snacks.add(item);
//        item = new Item();
//        item.setTitle("דוריטוס");
//        item.setPrice(6.6);
//        snacks.add(item);
//        item = new Item();
//        item.setTitle("מסטיק אורביט");
//        item.setPrice(6);
//        snacks.add(item);
//        cat.setItems(snacks);
//        categories.add(cat);
//
//        cat = new Category();
//        cat.setTitle("שתיה קרה");
//        cat.setDescription("כל סוגי השתיה הקרה");
//        items = new ArrayList<Item>(drinks);
//        cat.setItems(items);
//        categories.add(cat);
//
//
//        
//	}

}
