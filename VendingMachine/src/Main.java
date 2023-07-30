import java.util.*;
public class Main {
		public static void getProduct(String productCode)
		{
	switch(productCode)
	{
	case "P01":System.out.println("COCA COLA");
       break;
	case "P02":System.out.println("Fanta");
    break;
	case "P03":System.out.println("seven up");
    break;
	case "P04":System.out.println("mirinda");
    break;
    default:System.out.println("Water");
       break;
	}
	}

		
           
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the productCode");
	String productCode=scan.next();
	getProduct(productCode);
scan.close();

		}

}	


