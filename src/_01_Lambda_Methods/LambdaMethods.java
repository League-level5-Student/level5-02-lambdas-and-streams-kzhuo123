package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
//		for(int i = 0; i < 10; i++) {
	//			System.out.println(s);
//			}
	//	}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((value)->{
		String sa=" ";
		for (int i = value.length()-1; i < 0; i--) {
			sa+=value.charAt(i);
		}
		System.out.println(sa);
		}, "backwards");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String uplo= " ";
			for(int i = 0; i < s.length(); i++) {
				if (i%2==0) {
				
				}
			}
			System.out.println(uplo);
		}, "upperlower case");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
