import java.util.Scanner;
class Feet_Meters
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double MeterPerFoot=0.305;

		System.out.print("Enter the value for feet:  ");
		double feet=sc.nextDouble();

		double meter=feet*MeterPerFoot;

		System.out.println(feet +"Feet is" +meter +"meters");
	}
}