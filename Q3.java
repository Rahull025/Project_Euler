import java.util.*;
class LrgstPrime
{
	boolean isPrime(long n)
	{
		int c=0;
		for(long i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		return true;
		else
		return false;
	}
	
	public static void main(String args[])
	{
		LrgstPrime ob=new LrgstPrime();
		long n=600851475143L;
		for(long i=1;i<n;i++)
		{
			if(n%i==0&&ob.isPrime(i)==true)
			{
				System.out.println(i);
					
			}
		}
		;
	}
}