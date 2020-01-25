package com.ctsapps.training;

import java.util.Scanner;

public class Matrics {
	     public int a[][];
	     public void initMatrix() { 
	    	 Scanner sc = new Scanner(System.in);
	    	 int n,r,c;
	    	 System.out.println("enter the number of rows:");
	    	 r=sc.nextInt();
	    	 System.out.println("enter the number of colums:");
	    	 c=sc.nextInt();
	    	 int a[][]=new int[r][c];
	    	 for(int i=0;i<r;i++)
	    		for(int j=0;j<c;j++)
	    		{
	    			System.out.println("enter elements for row"+(i+1)+": column is "+(j+1)+"");
	    				
	    		}
	    	 
	    	 
	    	
	    }

}
