class Increment
{
	public static void main(String[] args) {
		
		/*int a =2;
		int b =a++; //2(3)
		int c=++a;  //4
                          //4+3+5
		System.out.println(a + ++b + ++c);*/

		/*int a=2;
		int b=++a;//3
                          //4+4
		System.out.println(++b + ++a);*/

		/*int a=3;
		int b=a++;//3(4)
		int c=a++;//4(5)
                          //5(6)+3(4)+4(5)+6+4(5)+5(6)
		System.out.println(a++ + b++ + c++ + a+b++ + c++);*/

		/*int a=4;
		int b=3;
                        // 4(5)+5+3(4)+5+4
		System.out.println(a++ + a + b++ + a + b);*/

		/*int a=2;
		int b=a;//2
		int c=b++;//2(3)
                         //2(3)+3(4)+2(3)+3+4+3
		System.out.println(a++ + b++ + c++ + a +b + c);*/

		/*int a=4;
		int b=a++;//4(5)
		int c=a;//5
                          //5+4+5
		System.out.println(a+b+c);*/

		int c=3;
		int d=c++;//3(4)
		int e=d++;//4(5)
                         //4(5)+5(6)+5(6)
		System.out.println(c++ + d++ + e++);
	}
}