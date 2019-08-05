import java.util.*;

public class Amicable {
	
	
	public static int summation(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			sum+=i;
		}
		return sum;
	}

	 public static boolean isAmicable(int n) {
		
		int t=summation(n);
		if(t!=n && summation(t)==n)
		return true; else return false;
	}
	
	public static void main(String args[])
	{
		int sum=0;
		for(int i=1;i<10000;i++)
		{
			if(isAmicable(i))
			sum+=i;
		}
		System.out.println(sum);
	}
}
      
