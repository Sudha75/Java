
public class Amstrong {
public int findAmstrong(int n) {
	int rem=0;
	 int res=0;
	 int sum=0;
	while(n!=0)
	{
		 rem=n%10;
		 res=res+(int)Math.pow(rem,3);
		 sum=sum+res;
		n=n/10;
	}
	return res;
}
}
