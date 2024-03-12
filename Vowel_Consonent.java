import java.util.Scanner;
class Vowel_Consonent
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character:");
		char ch = sc.next().charAt(0);
		String result= (ch=='a') ||  (ch=='e') ||  (ch=='i')  || (ch=='o') ||  (ch=='u') || (ch=='A') ||  (ch=='E') ||  (ch=='I')  || (ch=='O') ||  (ch=='U') ?"vowel" : "consonent";
	
        System.out.println("The character is :"+result);
		//System.out.println((ch=='a' || ch='A' || ch=='e' || ch='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') ?"vowel" : "consonent");
	}
}