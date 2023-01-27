package HellSelenium;

import java.util.Scanner;

public class Sum11 {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Addtion:"+sum);
		
		int exp=15;
		int act=sum;
		if(exp==act) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}}}
		
	/*while(num>0) {
		
		sum=sum+num;
		--num;
	}
	
	System.out.println("Sum:"+sum);
	
	int exp=36;
	int act=sum;
	if(exp==act) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	}*/


