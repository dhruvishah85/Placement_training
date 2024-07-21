package OOP;

public class Animal {
	
	//abstraction: Data hiding(public,private,protected,default)
	//encapsulation: Combining everything together in one class methods and variables
	//data members--Variables
	private String name,type_ani,food_habit;
	
	//functions
	public void setValue() {
		name="Dog";
		type_ani="Domestic";
		food_habit="mix";
	}
	
	public void display() {
		System.out.println(name+" "+type_ani+" "+food_habit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType_ani() {
		return type_ani;
	}

	public void setType_ani(String type_ani) {
		this.type_ani = type_ani;
	}

	public String getFood_habit() {
		return food_habit;
	}

	public void setFood_habit(String food_habit) {
		this.food_habit = food_habit;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type_ani=" + type_ani + ", food_habit=" + food_habit + "]";
	}//call using object name
	
}
