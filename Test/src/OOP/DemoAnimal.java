package OOP;

public class DemoAnimal {

	public static void main(String[] args) {
		//declaration
		Animal an=new Animal();
		an.setName("Cat");
		an.setType_ani("Wild");
		an.setFood_habit("non veg");
		System.out.println(an.getName()+" "+an.getType_ani()+" "+an.getFood_habit());
		System.out.println(an);
	}

}
