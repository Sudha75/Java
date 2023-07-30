
public class ReversingNumber {
public int findReverse(int n) {
	int rev=0;
	int originalnumber=n;
	while(n!=0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		
		
	}
	return rev;
}
}
