
public class day_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all inputs
		double price_1=70;
		double price_2=20;
		double price_3=10;
		double taxpercentage=18;
		//calculate the total amount of price_1,2,3;
		double totalproductPrice=price_1+price_2+price_3;
		//claculate the taxpercentage
		double taxamt=taxpercentage/100*totalproductPrice;
		//finding the result
		double result=taxamt+totalproductPrice;
		
		System.out.println("Final amount: " +result);
	}

}
