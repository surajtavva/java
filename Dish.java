package collections;


public class Dish  {
	
	private  boolean vegetarian;
	private int calories;
	private  Types DishType; 
	private  String name;
	
	
	public Dish(String name, boolean vegetarian, int calories, Types DishType) {
              super();
              this.name = name;
              this.vegetarian = vegetarian;
              this.calories = calories;
              this.DishType = DishType;
              
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DishType == null) ? 0 : DishType.hashCode());
		result = prime * result + calories;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (vegetarian ? 1231 : 1237);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (DishType != other.DishType)
			return false;
		if (calories != other.calories)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}
	


	@Override
	public String toString() {
		return "Dish [vegetarian=" + vegetarian + ", calories=" + calories + ", DishType=" + DishType + ", name=" + name
				+ "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public Types getDishType() {
		return DishType;
	}
	public void setDishType(Types dishType) {
		DishType = dishType;
	}
	
	
	
	
	    
		
			}


			
				
		
		
		
		
		
		




