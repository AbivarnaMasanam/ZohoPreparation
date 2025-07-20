package zohocodeing;

public class Blockmethods {
	// static block execution and initializer block execution 
	//When ever the program run static call first then only other's..
	
	public static void main(String[] args) {
		{
			System.out.println("welcome");
		}
	}
	//We give static at end also its execute first when the main loaded!.
	static {
		System.out.println("Hello World!");
	}
	
}
