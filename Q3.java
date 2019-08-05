import java.util.*;
class LrgstPrime
{
	static boolean isPrime(long n)
	{
		boolean flag=true;
		for(long i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		return true;
		else
		return false;
	}
	
	public static void main(String args[])
	{
		long n=600851475143L;
		for(long i=3;i<n/2;i+=2)
		{
			if(n%i==0&&isPrime(i))
			{
				System.out.println(i);
					
			}
		}
	}
}
