
public class Parrot extends Bird implements FlyBehavior {
	public Parrot(String color, int height, int weight, int width, int age) {
		super(color, height, weight, width, age);
		// TODO Auto-generated constructor stub
	}
	public void fly()
	{
		System.out.println("Parrot can fly");
	}
	public void swim()
	{
		System.out.println("Parrot Can't Swim");
	}
	
	
	public void eat(String item) {
		System.out.println("Parrot eating"+item);
	}
	
}
