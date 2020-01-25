package fact;
import java.util.*;
public class Digits {
	public static void main(String[]args)
	{
	    int n,m,r,temp=0;
	    Scanner sc = new Scanner(System.in);
	     n=sc.nextInt();
	    		while(n>0)
	    		{ 
	    		r=n%10;
	    		temp=temp*10+r;
	    		n=n/10;
	    		}
	    while(temp>0)
	    {
	    	m=temp%10;
	    	if(m==1)
	    		System.out.println("ONE");
	    	if(m==2)
	    	   System.out.println("TWO");
	    	if(m==3)
		       System.out.println("THREE"); 
		    if(m==4)
			   System.out.println("FOUR");
			 if(m==5)
				System.out.println("FIVE");	
		     if(m==6)
			    System.out.println("SIX");  
		   if(m==7)
			  System.out.println("SEVEN");
		   if(m==8)
	    		System.out.println("EIGHT");	
	    	if(m==9)
		        System.out.println("NINE");
	         else
	    	{
	    		System.out.println("ZERO");
	    		
	    	}
	    	temp=temp/10;
	    		
	     }
	    
	  }
 }


