import java.util.*;
public class Factorial {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to find factorial");
	int n=scan.nextInt();
	int fact=1;
	
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of number is:"+fact);
}
}
