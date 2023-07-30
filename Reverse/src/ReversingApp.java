import java.util.*;
public class ReversingApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number to reverse it");
	int n=scan.nextInt();
     
	ReversingNumber reversingnumber=new ReversingNumber();
	int rev=reversingnumber.findReverse( n);
	System.out.println(rev);
	if(n==rev)
	{
		System.out.println("entered number"+ n + "is palindrome");
	}
	else 
		System.out.println("entered number"+ n + "is not palindrome");
	
}
}
