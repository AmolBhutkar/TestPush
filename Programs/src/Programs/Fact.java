package Programs;

public class Fact {

	public static void main(String[] args) {
		int fact=1; 
		//int i;
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
