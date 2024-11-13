class Animal
{
	int a=10;
	int b=20;
	static int c=30;
	void eating()
	{
		System.out.println("eating in Animal");
	}
	void sleeping()
	{
		System.out.println("sleeping in Animal");
	}
}
class Dog extends Animal
{
	
	void fighting()
	{
		System.out.println("fighting in Dog");
	}
	void showAllFun()
	{
		System.out.println("Show All Fun");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		eating();
		sleeping();
		fighting();
	}
}
class Test134
{
            public static void main(String args[])
	{
		Animal ani=new Animal();
		ani.eating();
		ani.sleeping();
		System.out.println(ani.a);
		System.out.println(ani.b);
		System.out.println(ani.c);
		System.out.println("*****Dog*****");
		Dog dog=new Dog();
		dog.eating();	
		dog.sleeping();	
		dog.fighting();
		dog.showAllFun();
	}
}

