package sample.java;

import java.util.Scanner;
public class reverse {
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		int n,r,sum=0;
		n=s.nextInt();
		System.out.println("enter the number to reverse:");
	         while(n!=0)
			 r=n%10;
		     sum=sum*10+r;
		     n=n/10;
		 }
		System.out.println("the reverse number is:"+sum);
		

}
