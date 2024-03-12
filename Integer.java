import java.util.Scanner;
class Integer
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");

		char num=sc.next().charAt(0);
		System.out.println((num>='1'&&num<='9')?num+"is digit":num+"not digit");
	}
}