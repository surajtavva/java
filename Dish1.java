package collections;

public class Dish1 implements Comparable<Object> 
{
	private  String name;
	private boolean vegetarian;
	private int  calories;
	private static  Types DishType;
	
	Dish1( String name,boolean vegetarian,int calories, Types DishType){
		
		this.name= name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.DishType =  DishType;
		
	
		
		}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}
	
