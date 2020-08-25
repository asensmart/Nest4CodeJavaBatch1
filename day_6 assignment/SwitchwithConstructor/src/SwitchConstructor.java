
public class SwitchConstructor {

	String color;
	String shape;
	int height;
	int width;
	int weight;
	
	public SwitchConstructor(String color,String shape,int height,int width,int weight) {
		// TODO Auto-generated constructor stub
		this.color=color;
		this.shape=shape;
		this.height=height;
		this.width=width;
		this.weight=weight;
	}
	
	public void Show() {
		System.out.println("Color : "+ color);
		System.out.println("shape : "+ shape);
		System.out.println("height : "+ height);
		System.out.println("width : "+ width);
		System.out.println("weight : "+ weight);
	}
}
