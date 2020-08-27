
public class ConstructBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird ostrichobj=new Ostrich("white",5,50,3,5);
		ostrichobj.fly();
		ostrichobj.swim();
		((Ostrich)ostrichobj).eat("Plants");
		ostrichobj.display();
		
		Bird parrotobj=new Parrot("Green",2,5,1,1);
		parrotobj.fly();
		parrotobj.swim();
		((Parrot)parrotobj).eat("Red Chilli");
		parrotobj.display();
		
		Bird penguinobj=new Penguin("Black and White",3,20,2,1);
		penguinobj.fly();
		penguinobj.swim();
		((Penguin)penguinobj).eat("Fish");
		penguinobj.display();
	}

}
