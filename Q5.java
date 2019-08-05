import java.util.*;
class SmlMul
{
	static long gcd(long a,long b)
	{
		if(b==0)
		{
			return a;
		}
		return(gcd(b,a%b));
	}
	
	static long lcm(long n)
	{
		long r=1;
		for(int i=2;i<=n;i++)
		{
			r=(r*i)/gcd(r,i);
		}
		return r;
	}
	
	public static void main(String args[])
	{
		System.out.println(lcm(20));
	}
}
