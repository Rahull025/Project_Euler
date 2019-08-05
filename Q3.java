import java.util.*;
class LrgstPrime
{
	
	public static void main(String args[])
	{
		long n=600851475143L;
		for(long i=3;i<n/2;i+=2)
		{
			if(n%i==0)
			{
				n/=i;
			}
		}
		System.out.println(n);
	}
}
