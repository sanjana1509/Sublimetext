import java.util.Scanner;
class CostOfDriving
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the driving distance:");
		double distance=sc.nextDouble();
		System.out.print("Enter the miles per gallon:");
		double milespergallon=sc.nextDouble();
		System.out.print("Enter the price per gallon:");
		double pricepergallon=sc.nextDouble();
		double costOfDriving=(distance/milespergallon)*pricepergallon;
		System.out.print("The cost of driving is "+costOfDriving);
	}
}