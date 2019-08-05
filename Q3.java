class Q3
{
   static long smlFactor(long n)
	{
		long end=(long)Math.sqrt(n);
		for(int i=2;i<=end;i++)
		{
			if(n%i==0)
			return i;
		}
		return n;
	}
	
	public static long calc(long n)
	{
		while(true)
		{
			long p=smlFactor(n);
			if(p<n)
			{
				n/=p;
			}
			else 
			return n;
		 }
	}
	
	public static void main(String args[])
	{
		long n=600851475143L;
		System.out.println(calc(n));
		
	}
}
