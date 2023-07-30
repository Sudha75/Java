
public class Fibonacci {
public String findFibonacci(int n)
{
	int fib1=0;
	int fib2=1;
	int nextnumber;
	if(n==1)
	{
		System.out.print(fib1);
		return "completed";
	}
	else if(n==2)
	{
		System.out.print(fib1+ " "+fib2 +" ");
		return "completed";
	}
	else 
	{
		System.out.print(fib1+" "+fib2+" ");
		
		for(int i=3;i<=n;i++)
		{
			nextnumber=fib1+fib2;
			System.out.print(nextnumber +" ");
			fib1=fib2;
			fib2=nextnumber;
			
		}
		return "completed";
			
	}
}
}
