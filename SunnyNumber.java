import java.util.*;
class SunnyNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int nnum = num + 1;
		//int nnum = sc.nextInt();
		Boolean flag=false;
        int sqrrt=0;
		for(int i =1; i<=nnum/2;i++)
		{
           if(i*i==nnum)
			{
				flag=true;
				sqrrt=i;
				break;
			}
		}
        if(flag)
        {
        	System.out.println(sqrrt+ "Is sunny number");
        }
        else 
        {
        	System.out.println(nnum+ " is not sunny number");
        }
	}
}
