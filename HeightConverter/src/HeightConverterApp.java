import java.util.*;
public class HeightConverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the height in inches");
	double inches=scan.nextDouble();
	HeightConverter converter = new HeightConverter();

System.out.println(	converter.convertInchesToFeet(inches));

}
}
