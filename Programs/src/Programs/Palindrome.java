package Programs;

public class Palindrome {

	public static void main(String[] args) {
		String s="nitin";
		StringBuilder sb =new StringBuilder(s);
		String str=sb.reverse().toString();
		
		if(str.equals(s)) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String not Palindrome");
		}
		
	}

}
