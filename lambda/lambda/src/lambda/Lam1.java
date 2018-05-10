package lambda;
import java.util.*;

interface calcFactorial{
	public int factorial(int x);
}

public class Lam1 {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		
		calcFactorial s1 = (n)->{
	          int f=1;
	          for(int i=1;i<=n;i++)
	          {
	              f=f*i;
	          }

	          return f;
	      };

	      System.out.print("factorial="+s1.factorial(x));
	}

}
