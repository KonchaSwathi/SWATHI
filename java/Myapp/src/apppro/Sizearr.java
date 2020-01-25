package apppro;
import java.util.*;

public class Sizearr {
	public void  average(int n)
	{
		System.out.println("enter the size of array:");
		System.out.println("enter the values of array:");
		int k=0,sum=0;
		int a[] = new int[n];
		for(int i=0;i<=n;i++)
		{
			System.out.println("elements of an array :a["+i+"]"+a[i]);
			k++;
		}
		for(int i=0;i<=n;i++)
		{
			if(a[i]%5==0)
			{
				sum=a[i]+sum;
			}
			System.out.print("the average of an array is:"+(sum/k));
		}
	}
	
public void minimum(int n)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values:");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	for(int j=0;j<=n;j++)
	{
		if(a[i]>a[j])
            temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("the minimum value in array is:+a["+i+"]"+a[i]);
	}		
	}
	
	
	
	
	
}
		
	
	
}

