
public class Penguin extends Bird implements SwimBehavior {
	public Penguin(String color, int height, int weight, int width, int age) {
		super(color, height, weight, width, age);
		// TODO Auto-generated constructor stub
	}
	public void fly()
	{
		System.out.println("Penguine can't fly");
	}
	public void swim()
	{
		System.out.println("Penguin can swim");
	}
	
	public void eat(String item) {
		System.out.println("Penguin eating "+ item);
	}
	
}
