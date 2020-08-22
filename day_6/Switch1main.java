package day_6;

import java.util.*;
public class Switch1main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The color : ");
		String color=sc.next();
		System.out.println("Enter The height : ");
		int height=sc.nextInt();
		System.out.println("Enter The width : ");
		int width=sc.nextInt();
		System.out.println("Enter The weight");
		int weight=sc.nextInt();
		System.out.println("Enter The thickness : ");
		int thickness=sc.nextInt();
		Switch1 Switch1obj1 = new Switch1(color,height,width,weight,thickness);
		
		//Create a 5 object of switch
		
		
		Switch1obj1.instvari();
		Switch1obj1.on();
		
	}

}
