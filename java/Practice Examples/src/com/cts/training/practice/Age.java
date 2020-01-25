package com.cts.training.practice;
import java.util.Scanner;

public class Age {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter your name:");
		String n=sc.nextLine();
		/*System.out.println("enter your age:");
		int n1=sc.nextInt();*/
		if(n.matches("[a-zA-Z]"))
		{
			System.out.println("string has only alphabets");
		}
		else 
		{
			System.out.println("It has other characters");
		}
		
	}
	
		
		
		
	}

