class StaticVariable
{
	
    //we can only create a static variable inside the class block
	/*static String str="HI I AM A STATIC VAR";
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		System.out.println(str);
		StaticVariable obj = new StaticVariable();
		obj.m1();
		
	}

	public void m1()
	{
		System.out.println(str);
	}*/

	
	//static variables are initialized with default value

	/*static byte a;
	static int b;
	static short c;
	static long d;
	static float e;
	static double f;
	static boolean g;
	static String h;

	public static void main(String[] args) 
	{
	  System.out.println(a);//0
	  System.out.println(b);//0
	  System.out.println(c);//0
	  System.out.println(d);//0
	  System.out.println(e);//0.0
	  System.out.println(f);//0.0
	  System.out.println(g);//false
	  System.out.println(h);//null	
	} */


     //we can access static variable directly anywhere within the same class directly
	
	/*static int i;
	public static void main(String[] args) 
	{
		System.out.println(i);//0
		i=10;
		m1();//10
		

	}

	public static void m1()
	{
		System.out.println(StaticVariable.i);
	}

	 void m2() //non-static method m2() cannot be referenced from a static context
	{
		System.out.println(i);

	}*/

    

    //If we have global and local variable with the same name then to access the global variable class name is mandatory
	
	/*static String vr = "Hi I am Global";
	public static void main(String[] args) 
	{
		String vr = "Hi I am Local";
		System.out.println(vr);
		System.out.println(StaticVariable.vr);
		m1();
		
	}

	public static void m1()
	{
		System.out.println(vr);
	}*/

	static int i = 10;
	public static void main(String[] args) 
	{
		String i = "20";
		System.out.println(StaticVariable.i);
		StaticVar2.m2();
		m1();
	}

	public static void m1()
	{
		System.out.println(i);
		StaticVar2.m2();
	}

}

class StaticVar2
{
	static int j = StaticVariable.i;

	public static void m2()
	{
		System.out.println(StaticVariable.i);
		StaticVariable.i=50;
		m3();
	}

	public static void m3()
	{
		System.out.println(j);
		System.out.println(StaticVariable.i);
	}
}