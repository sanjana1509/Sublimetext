import java.util.Scanner;
class BMI
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weight in pounds:");
		double weightPound=sc.nextDouble();
		System.out.print("Enter height in inches:");
		double inchesHeight=sc.nextDouble();
		double weightkg=weightPound*0.453592;
		double heightMeter=inchesHeight*0.0254;
		double BMI=weightkg/heightMeter*heightMeter;
		System.out.print("The BMI is :"+BMI);
	}
}