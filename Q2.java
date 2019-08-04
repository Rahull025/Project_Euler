import java.util.*;
public class fib
{
	static int sum=0,fib=0;
	
	public static void fibonacci(int i,int j)
	{
		fib=j;
		if(fib<=4000000)
		{
			if(j%2==0){
			sum+=j;
			}
			fibonacci(j,i+j);
		}
		else
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		fibonacci(1,2);
	}
}
