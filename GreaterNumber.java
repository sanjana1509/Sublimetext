import java.util.Scanner;
class GreaterNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	   /* System.out.print("Enter the num1: ");
	    int num1=sc.nextInt();
	    System.out.print("Enter the num2: ");
	    int num2=sc.nextInt();
	    int min=(num1>num2)?num2:num1;
	    System.out.println(min+"min number" );*/

       /* System.out.print("Enter the num1: ");
	    int num1=sc.nextInt();
	    System.out.print("Enter the num2: ");
	    int num2=sc.nextInt();
	    int max=(num2<num1)?num1:num2;
	    System.out.println(max+"Largest number");*/


        System.out.print("Enter the num1: ");
	    int num1=sc.nextInt();
	    System.out.print("Enter the num2: ");
	    int num2=sc.nextInt();
	    System.out.print("Enter the num3: ");
	    int num3=sc.nextInt();
	    int max =(num1>num2&&num1>num3)?num1:((num2>num3)? num2:num3);
	    System.out.println(max+"largest number");


	}
}