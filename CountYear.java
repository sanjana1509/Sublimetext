import java.util.Scanner;
class CountYear
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the number of minutes : ");
		

		long minutes=sc.nextLong();
		long minutePerYear=60*24*365;
		long year=minutes/minutePerYear;
		long days=(minutes%minutePerYear)/1440;
		System.out.println("There are "+ year +"years, "+days +"days");
	}
}