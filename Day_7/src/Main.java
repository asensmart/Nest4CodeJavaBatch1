
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ostrich ostrich=new Ostrich("white",5,50,3,5);
		ostrich.fly();
		ostrich.swim();
		ostrich.display();
		
		Parrot parrot=new Parrot("Green",2,5,1,1);
		parrot.fly();
		parrot.swim();
		parrot.display();
		
		Penguin penguin=new Penguin("Black and White",3,20,2,1);
		penguin.fly();
		penguin.swim();
		penguin.display();
	}

}
