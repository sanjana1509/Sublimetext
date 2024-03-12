import java.util.Scanner;
class Sum_Digit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number between 0 to 1000: ");
		int number = sc.nextInt();

		int lessThan10=number%10;
		number/=10;

		int tens=number%10;
		number/=10;

		int hundreds=number%10;
		number/=10;

        int sum=hundreds+tens+lessThan10;

       System.out.println("The sum of the digit is: "+sum);


	}
}