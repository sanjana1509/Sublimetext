import java.util.*;
class SpyNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num = sc.nextInt();
		int dup = num;
        int sum=0;
        int prod=1;
        while(num!=  0)
        {
        	int rem =num%10;			
        	sum+=rem;
        	prod*=rem;
        	num/=10;
        }
        if(sum==prod)
        {
        	System.out.println(dup+ " is spy number");
        }
        else 
        {
        	System.out.println(dup+ " is not spy number");
        }
	}
}