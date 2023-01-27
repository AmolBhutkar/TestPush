package Programs;

public class FibSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13
		
		/*
		 * int num1=0; 
		 * int num2=1; 
		 * int sum=0; 
		 * 
		 * System.out.print(num1+ " ");
		 * System.out.print(num2+ " ");
		 * 
		 * 
		 * for(int i=0;i<10;i++) {
		 * 
		 * sum=num1+num2;
		 * 
		 * System.out.print(sum+" ");
		 * 
		 * num1=num2; 
		 * 
		 * num2=sum;
		 * 
		 * 
		 * }
		 */
		
		int fib[]=new int[10];
		
		fib[0]=0;
		fib[1]=1;
		
		for (int i=2;i<fib.length;i++)
		{
			
			fib[i]=(fib[i-2] + fib[i-1]);
		}
		
		
		for (int j=0;j<fib.length;j++)
		{
			
			System.out.print(fib[j] + " ");
		}

	}

}
