package Programs;

public class Upper {

	public static void main(String[] args) {
		String str ="Tomorrow Is A Holiday";
		int upper=0;
		int lower=0;
		
		for(int i=0; i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			 else if (ch>='a' && ch<='z')
			{
			
				lower++;}
		}
		System.out.println("String is Upper:"+upper);
		System.out.println("String is lower:"+lower);
	}

}