package zohocodeing;

import java.util.Scanner;

public class Day1 {
	
	public static void PowerOfTwo(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp;
		boolean res=false;
		for (int i=0;i<n;i++) {
			temp = (int)Math.pow(2, i);
			if(temp==n) {
				res=true;
			}
		}
		System.out.println(res);
		scan.close();
	}
	
}
