package Programs;

import java.util.Scanner;

public class Pal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
	int num=sc.nextInt();
		//int num;
		
		int a=num,rev=0,temp=0;
		temp=num;
		while(a>0) {
			num=a%10;
			rev=(rev*10)+num;
			a=a/10;
			
		}
		
		System.out.println(rev);
		if(rev==temp)
			{
			 System.out.println("Num is Palindrom");
			}else {
				System.out.println("Num is Not Palindrom");
			}
	}

}
