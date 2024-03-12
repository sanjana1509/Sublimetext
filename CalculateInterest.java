import java.util.Scanner;
class CalculateInterest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the balance:");
		double balance=sc.nextDouble();
		System.out.print("Enter the annual interest rate:");
		double annualInterestRate=sc.nextDouble();
		double interest=balance*(annualInterestRate/1200);
		System.out.print("Interest is "+interest);
	}
}