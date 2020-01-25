package com.javafsk.cts;


public class calcules1 
{
	 public int reverse(int n)
	 {
		 int temp=0,r;
		 while(n>0) 
		 {
			 r=n%10;
		    temp=temp*10+r;
		     n=n/10;
		  }
		 return temp;
	 }	 
 
public void words(int n) 
{
        int m,r,temp=0;
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
        }
}	    
 public void expand(int n)
 {
	  int r,r1,temp=0,c=0;
	  while(n>0)
	 {
		r=n%10;
	    temp=temp*10+r;
		c++;
		n=n/10;
	 }
	 while(temp>0)
	{
	  r1=temp%10;
	 if(temp>10)
		System.out.println(r1+" "+(int)Math.pow(10,c-1)+"+");
	else
	   System.out.println(r1+" "+(int)Math.pow(10,c-1)+"+");
	  temp=temp/10;
	 c--;
					  
    }
		  
}
} 
	    
	
