package mutiplechecker;

import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n,int m) {
		if(n%m==0)
		{
			System.out.println("number"+n+"is multilpe of"+m);
		}
		else
		{
			System.out.println("number"+n+" is not multiple of "+m);
		}
	}
		public static void main(String []args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the 2 number");
			int n=scan.nextInt();
			int m=scan.nextInt();
			checkMultipleOfTen(n,m);
		}
	
	}

