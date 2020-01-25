package calculate;

import java.util.Scanner;
public class symbol {
	  public static void main(String args[])
	  {
		  Scanner sc= new Scanner(System.in);
		  int n,r,r1,temp=0,c=0;
		  n=sc.nextInt();
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
