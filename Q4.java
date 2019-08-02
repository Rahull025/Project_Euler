import java.util.*;
class PalinProduct
{
	boolean isPalin(int n)
	{
		int r=0,s=0,t=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(s==t)
		return true;
		else
		return false;
	}
	
	public static void main(String args[])
	{
		PalinProduct ob=new PalinProduct();
		int prod=0,max=0;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				prod=i*j;
				if(ob.isPalin(prod)==true)
				{
					if(prod>max)
					max=prod;
				}
			}
		}
		System.out.println(max);
	}
}