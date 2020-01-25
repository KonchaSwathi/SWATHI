package patern3;

public class Pattern2 {
	public void pattern2(int n)
	{
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<5-1;j++) 
			{
				System.out.println(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.println("k");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.println("l");
			}
			System.out.print("/n");
		}

    }
}	
