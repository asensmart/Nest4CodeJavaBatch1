import java.util.*;
public class day_5 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("How many Half diamond u want : ");
			int a=sc.nextInt();
			
			int row;
			
			//print the top half diamond
			for (int diamond = 1; diamond <= a ; diamond++) {
				System.out.print("Number 1 : ");
				row=sc.nextInt();
				for (int i =1 ; i <= row; i++) {
					for (int j = 1; j <=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				//print the bottom half diamond
			for (int i = 1; i <= row; i++) {
				for (int j = row; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
			}
		}
		
	}

}
