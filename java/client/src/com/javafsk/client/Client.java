package com.javafsk.client;
import com.javafsk.*;
import java.util.*;
public class Client {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		calcules1 c=new calculate();
		c.reverse(n);
		c.words(n);
		c.expand(n);
}
