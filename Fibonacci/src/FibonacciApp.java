import java.util.*;
public class FibonacciApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scan.nextInt();
	Fibonacci fibonacci=new Fibonacci();
     fibonacci.findFibonacci(n);
}
}
