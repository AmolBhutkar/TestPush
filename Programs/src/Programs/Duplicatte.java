package Programs;

public class Duplicatte {

	public static void main(String[] args) {
		String str="india";
		//String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("String is vowels:"+ch);
			}
		}

	}

}
