import java.util.*;
public class MathPow {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	  System.out.print("Enter the base number: ");
	  int base = scanner.nextInt();

	  System.out.print("Enter the exponent: ");
	  int exponent = scanner.nextInt();

	  double result = Math.pow(base, exponent);
 System.out.println(base + " raised to the power of " + exponent + " is: " + result);

	        scanner.close();
	    }
	}


