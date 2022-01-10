package recurssion;

public class StringReverse {
	
	public static String reverse (String str) {
		
		//Base condition
		if (str.length() == 0) {
			return str;
		} else {
			return reverse (str.substring(1)) + str.substring(0, 1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(StringReverse.reverse("HelloWorld"));
	}

}
