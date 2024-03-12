import java.util.Scanner;
class RunwayLength
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the speed:");
		double speed=sc.nextDouble();
		System.out.print("Enter the acceleration:");
		double acceleration=sc.nextDouble();
		double RunwayLength=speed/2*acceleration;
		System.out.print("The RunwayLength is :"+RunwayLength);

	}
}