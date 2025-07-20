package zohocodeing;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a and b:");
		int a=scan.nextInt();
		int b = scan.nextInt();
		System.out.println((a>b)?a:b);
	}
}
