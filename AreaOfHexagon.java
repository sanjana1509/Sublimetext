import java.util.Scanner;

class AreaOfHexagon
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the length of side of hexagon:");
		double length=sc.nextDouble();
		double AreaOfHexagon=(3*Math.sqrt(2)* Math.pow(length,2))/2;
		System.out.print("Area of Hexagon is :"+AreaOfHexagon);

	}
}