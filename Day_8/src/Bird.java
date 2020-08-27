
public abstract class Bird {
	
	String color;
	int height;
	int weight;
	int width;
	int age;
	
	public Bird(String color,int height,int weight,int width,int age) {
		this.color=color;
		this.height=height;
		this.weight=weight;
		this.width=width;
		this.age=age;
	}
	
	public abstract void fly();
	public abstract void swim();
	
	public void eat()
	{
		System.out.println("Eating...");
	}
	
	public static void sleep()
	{
		System.out.println("Sleeping...");
	}
	public void display()
	{
		System.out.println("Color : "+ color);
		System.out.println("Height : "+ height);
		System.out.println("Weight : "+ weight);
		System.out.println("width : "+ width);
		System.out.println("age : "+ age);
	}
}
