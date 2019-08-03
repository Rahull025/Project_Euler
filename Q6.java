import java.util.*;
class SumSquare
{
	public static void main(String args[])
	{
		int sumofeach=0,sumofall=0,diff=0;
		for(int i=1;i<101;i++)
		{
			sumofeach=sumofeach+((int)Math.pow(i,2));
			sumofall=sumofall+i;
		}
		diff=(int)Math.pow(sumofall,2)-sumofeach;
		System.out.println("The Difference is : "+diff);
	}
}