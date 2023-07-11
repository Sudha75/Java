import java.util.*;
public class FinanceCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the principal amount");
	double principal=scan.nextDouble();
	System.out.println("Enter rate of interest");
	double rate=scan.nextDouble();
	System.out.println("Enter the time taken in years");
	double time=scan.nextDouble();
	FinanceCalculator calculator = new FinanceCalculator();

 System.out.println( "simple intrest is:"+calculator.calculateSimpleInterest(principal, rate, time));
}
}
