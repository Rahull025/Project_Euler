import java.util.*;
public class fibb
{
	public static void main(String args[])
	{
		int n1=0,n2=1,sum=0,t;
		
		while(n1<=4000000)
		{
			t=n1;
			n1=n2;
			n2=n2+t;
			
			if(n2%2==0)
			{
				sum=sum+n2;
			}
		}
		System.out.println("The Sum Is : "+sum);
	}
}
