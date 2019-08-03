public class Sml_Multiple
{

    public static void main(String[] args) {
    	
    	Sml_Multiple ob=new Sml_Multiple();
        System.out.println(ob.findSmallestMultiple(20));
    }
    
    long findSmallestMultiple(int n) {
        for (long i = n; i <= factorial(n); i += n) {
            if (isMultiple(i, n)) return i;
        }
        return -1;
    }
    
    boolean isMultiple(long x, int n) {
        for (int i = 1; i < n; i++)
        {
            if (x % i!= 0) 
            return false;
        }
        return true;
    }
    
    long factorial (long n) {
        if (n > 1)
        return n * factorial(n - 1);
        else if (n >= 0) return 1;
        else return -1;
    }
}