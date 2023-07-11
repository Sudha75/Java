import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double fahrenheit=scan.nextDouble();

	TemperatureConverter temperatureConverter = new TemperatureConverter();
	double res=temperatureConverter.convertFahrenheitToCelsius(68.0);
	System.out.printf("%.2f",res);
}
}