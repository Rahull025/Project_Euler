import java.util.*;

public class Amicable {

	int isAmicable(int n) {
		
		int sum1=0,sum2=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum1=sum1+i;
			}
		}
		for(int i=1;i<sum1;i++)
		{
			if(sum1%i==0)
			{
				sum2=sum2+i;
			}
		}
		if(sum2==n&&sum1!=sum2)
			return sum2;
		else
		    return 0;
	}
	
	public static void main(String args[])
	{
		int fin=0;
		Amicable ob=new Amicable();
		
		for(int i=1;i<10000;i++)
		{
			if(ob.isAmicable(i)!=0)
			{
			fin=fin+ob.isAmicable(i);
			}
		}
		System.out.println(fin);
	}
}
      
