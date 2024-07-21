package OOP;
import java.util.Scanner;

public class Supply {
	private int Code;
	private String FoodName, Sticker, FoodType;
	
	private String GetType() {
		if(Sticker.toLowerCase().equals("green")) {
			FoodType = "Vegetarian";
		}
		else if(Sticker.toLowerCase().equals("yellow")) {
			FoodType = "Contains Egg";
		}
		else if(Sticker.toLowerCase().equals("red")) {
			FoodType = "Non Vegetarian";
		}
		return this.FoodType;
	}
	public void FoodIn() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Code:");
		Code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter FoodName:");
		FoodName=sc.nextLine();
		System.out.println("Enter Sticker color:");
		Sticker=sc.nextLine();
		FoodType=GetType();
	}
	public void FoodOut() {
		System.out.println(Code+"\n"+FoodName+"\n"+Sticker+"\n"+FoodType);
	}
	
	public static void main(String[] args) {
		Supply s1=new Supply();
		s1.FoodIn();
		s1.FoodOut();
	}
}
