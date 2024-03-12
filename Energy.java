import java.util.Scanner;
class Energy
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount of water in kilogram: ");
		double kilogram=sc.nextDouble();
		System.out.print("Enter final temperature:");
		double finalTemperature=sc.nextDouble();
		System.out.print("Enter initial temperature:");
		double initialTemperature=sc.nextDouble();
		double energy=kilogram*(finalTemperature-initialTemperature)*4184;
		System.out.println("The Energy is:"+energy);
	}
}