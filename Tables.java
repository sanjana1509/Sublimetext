import java.util.*;
class Tables
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			//System.out.print(num);
			System.out.println(num+"*"+ i +"="+(num*i));
		}
	}
}