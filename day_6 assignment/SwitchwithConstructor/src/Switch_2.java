
public class Switch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch s1=new Switch();
		s1.color="Blue";
		s1.shape="Box";
		s1.height=1;
		s1.width=1;
		s1.weight=100;
		s1.on();
		s1.off();
		s1.currentflow();
		SwitchConstructor s2=new SwitchConstructor("blue","box",2,3,2);
		s2.Show();
	}
}