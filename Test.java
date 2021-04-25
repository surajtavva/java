package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Dish> namesList = new ArrayList<Dish>();
		
		
		
		namesList.add(new Dish("Pork fry", false, 800, Types.MEAT));
        
		namesList.add(new Dish("Pepper Chicken", false, 700, Types.MEAT));
		
	 namesList.add(new Dish("BBQ Ribs", false, 600,Types.MEAT));
		
		 namesList.add(new Dish("French Fries", true, 500, Types.OTHER));
		
		 namesList.add(new Dish("Double Cheeze Pizza", true, 400 , Types.OTHER));
		
		namesList.add(new Dish("Season Fruit", true, 120, Types.OTHER));
		
		namesList.add(new Dish("Salmon", false, 500, Types.FISH));
		
		namesList.add(new Dish("Prawns", false, 300, Types.FISH));
		
		 namesList.add(new Dish("Rice pudding", true, 200, Types.OTHER));
		
		 namesList.add(new Dish("Milk Shake", true, 150, Types.OTHER));
		 
		 
		 
		
		
		for (Dish dish : namesList ) {
			 System.out.println(dish);
		 }
		
	}
}

