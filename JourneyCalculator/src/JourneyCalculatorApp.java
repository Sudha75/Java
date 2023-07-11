import java.util.*;
public class JourneyCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	
	JourneyCalculator journeyCalculator = new JourneyCalculator();
	double result=journeyCalculator.calculateDistance(speed,time);
	 System.out.printf("%.2f",result);
}
}
