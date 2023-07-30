import java.util.*;
public class Factors {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to find factors");
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			
				System.out.println("factors is"+i);
			}
		}
		
}
}