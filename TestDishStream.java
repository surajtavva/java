package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDishStream {
	

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
		 
		 
		// Stream<Dish> stream = namesList.stream();
		 
		// Stream<Dish> newStream = stream.filter(d ->  d.getDishType().equals(DishType.MEAT)).collect(Collectors.toList());
		 
		 // List<Dish> dishs = newStream.collect(Collectors.toList());
		 
		 
		 List<Dish> dishes = namesList.stream().filter(d ->d.getDishType().equals(Types.MEAT)).collect(Collectors.toList());
		 
		//  List<Dish> VegDishes = namesList.stream().filter(d ->d.isVegetarian()).collect(Collectors.toList());
		 
		 List<Dish> dishP = namesList.stream().filter(d -> d.getName().toString().startsWith("P")).collect(Collectors.toList());
		 
		 for (Dish dish : dishP) {
			 
			 System.out.println(dish);
		 }
		 
		
		
		for (Dish dish : namesList ) {
			 System.out.println("bnbb",dish);
		 }
		
	}
}



