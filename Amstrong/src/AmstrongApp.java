import java.util.*;
public class AmstrongApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check amstrong or not");
		int n=scan.nextInt();
		Amstrong amstrong=new Amstrong();
		int res=amstrong.findAmstrong( n);
		System.out.println(res);
		if(n==res)
		{
			System.out.println("entered number"+n+"is amstrong");
		}
		else
			System.out.println("entered number"+n+"is not amstrong");
	}

}
