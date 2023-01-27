package HellSelenium;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) {
		int sum=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		int spect=55;
		int act=sum;
		if(act==spect) {
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
