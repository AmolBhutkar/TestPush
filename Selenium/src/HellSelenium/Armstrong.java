package HellSelenium;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int a,i=0,j=0;
				a=num;
				while(a>0){
					i=a%10;
					j=(i*i*i)+j;
					a=a/10;
				}
				System.out.println(j);
				if(num==j) {
					System.out.println("Number is armstrong");
					
				}else {
					System.out.println("Number is not armstrong");
				}
					
	}

}
