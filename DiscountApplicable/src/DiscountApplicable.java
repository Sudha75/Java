import java.util.*;
public class DiscountApplicable {
	public static void checkDiscount(double purchaseAmount)

	{ 
	if(purchaseAmount>100)
	{
		System.out.println("discount applicable");
	}
}

	public static void main() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter PurchaseAmount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
	}
}



