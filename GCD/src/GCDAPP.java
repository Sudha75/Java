import java.util.*;
public class GCDAPP {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 2 numbers to find gcd");
	int m=scan.nextInt();
	int n=scan.nextInt();
	GCD.findGcd( m,n);
	System.out.println("gcd of"+m+"and"+n+"is:"+GCD.findGcd( m,n));
	
}
}
