package OOP;

public class DemoVehicle {
	public static void main(String[] args) {
		//declaration
		Vehicle c1=new Vehicle();
		c1.setName("Wagon R");
		c1.setCompany("Maruti Suzuki");
		c1.setColour("White");
		c1.setFuelType("Petrol");
		System.out.println(c1.getName()+"\n"+c1.getCompany()+"\n"+c1.getColour()+"\n"+c1.getFuelType());
		
	}

}
