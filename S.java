class S
{
	static void methodOne()
	{
		System.out.println("AAA");
	}
}

class B extends S
{
	static void methodOne()
	{
		System.out.println("BBB");
	}
}

 class MainClass
{
	public static void main(String[] args)
	{
		S a = new B();
		
		a.methodOne();
	}	
}