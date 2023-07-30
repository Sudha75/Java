import java.util.*;
public class CheckPrime {
public static void main(String[] args) {
	System.out.println("enter the range to print prime numbers");
	int n=scan.nextInt();
	int count=0;
	for(int i=3;i<=n;i++)
	{
		int res=checkPrime(i);
		if(res!=0)
		{
			System.out.println(res);
			count++;
		}
	}
	System.out.println("number of prime numbers");
}
}
