import java.util.*;
public class TimeConverter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the time taken in minutes");
		int minutes=scan.nextInt();
           TimeConverter tc=new TimeConverter();
           tc.convertToHours(minutes);
        System.out.println("given time in hours is" + convertToHours(minutes));
	}
public static double convertToHours(int minutes)
{
	return (minutes) / 60 ;
}
}
