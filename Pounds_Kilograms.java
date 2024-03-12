import java.util.Scanner;
class Pounds_Kilograms
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double KilogramPerPound=0.454;

		System.out.print("Enter a number in pounds: ");
		double pounds = sc.nextDouble();

		double kilograms = pounds * KilogramPerPound;

		System.out.println(pounds+"pounds is "+kilograms+"kilograms");
	}
}