import java.util.*;
public class Prime
{
	public static boolean isPrime(long n)
	{
		int c=0;
		boolean f=false;
		for(long i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			f=true;
			break;
			}
		}
		if(!f)
		return true;
		else
		return false;
	}
  
    public static long nthPrime(long n) {
        int numberOfPrimes = 0;
        long prime = 1;
        
        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }
    
   public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }
}
