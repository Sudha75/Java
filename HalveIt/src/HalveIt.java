import java.util.*;
public class HalveIt {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	double num=scan.nextDouble();
	HalveIt halve=new HalveIt();
	halve.halveTheNumber( num);
	System.out.println("halve of given number is:"+ halveTheNumber (num));
}
public static double halveTheNumber(double num)
{
	return num/2;
}
}
