// WAJP CHARACTER IS ALPHABET OR NOT
import java.util.Scanner;
class Alphabet
{
	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the character:");

		char ch=sc.next().charAt(0);
		System.out.println(((ch>=65&&ch<=90)||(ch>=97&&ch<=122))?"alphabet":"not alphabet");
		//System.out.println(((ch>=A&&ch<=Z)||(ch>=a&&ch<=z))?"alphabet":"not alphabet");



	}
}

