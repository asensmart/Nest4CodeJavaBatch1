package day_6;

import java.util.*;
public class Switch1 {
	
	Scanner sc=new Scanner(System.in);
			// Instance variable
				String color;
				int height;
				int width;
				int weight;
				int thickness;
				
				//Parameterized constructor
				public Switch1(String c,int h,int w,int wei,int thick)
				{
					color=c;
					height=h;
					width=w;
					weight=wei;
					thickness=thick;
				}
				
				
				//Instance Method
				public void on()
				{
					System.out.println("Switch On");
				}
				public void off()
				{
					System.out.println("Switch Off");
				}
				public void currentflow() {
					System.out.println("Current Flow through wire to electrical devices");
				}
				public void instvari() {
					System.out.println("color :" + color);
					System.out.println("height :" + height);
					System.out.println("width :" + width);
					System.out.println("weight :" + weight);
					System.out.println("thickness :" + thickness);
				}
}
