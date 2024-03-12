import java.util.Scanner;
class CalculateTip
{
	public static void main(String [] args)
	{
		
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter the subtotal: ");
	    double subtotal=sc.nextDouble();
	    System.out.println("Enter the tiprate: ");
	    double tipRate=sc.nextDouble();
	    
	    double tip = subtotal*tipRate/100;
	    double total=subtotal+tip;
	    System.out.println("The tip is"+tip+"total is"+total);

	}
}