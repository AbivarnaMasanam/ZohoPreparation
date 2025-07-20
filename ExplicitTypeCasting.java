package zohocodeing;

public class ExplicitTypeCasting {
	
	public static void main(String[] args) {
		//Explicit type casting
		int a = 98;  // 4bytes or 32 bit's
		double b =98.55; // 8 bytes or 64 bit's
		
		System.out.println(a);
		System.out.println(b);
		
		// the mention (byte) is the explicit type casting
		// convert the larger data type to smaller one.
		
		byte c = (byte)a;
		float f=(float)b;
		System.out.println(c);
		System.out.println(f);
		
	}
	
}
