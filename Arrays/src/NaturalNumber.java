import java.util.*;
public class NaturalNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int N=scan.nextInt();
	int sum=0;
	for(int i=1;i<=N;i++) {
		sum=sum+i;
	}
	System.out.println("number is"+sum);
}
}
