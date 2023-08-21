package Programs;

import java.util.Scanner;

public class Rev1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int a ,i=0,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			System.out.println(i);
			j=(j*10)+i;
			System.out.println(j);
			a=a/10;
			System.out.println(a);
		}
		System.out.println(j);

	}

}
