package recurssion;

public class Factorial {
	
	public static int factorial (int number) {
		
		//base condition
		if (number == 0 )
			return 1;
		
		
		return number * factorial (number - 1 );
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial.factorial(3));
		
	}

}
