package zohocodeing;

import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a and b:");
		int a=scan.nextInt();
		int b = scan.nextInt();
		 switch (a - b) {
         case 0:
             System.out.println("Equal!");
             break;
         default:
             System.out.println("Not equal!");
     }
		 scan.close();
	}
}
