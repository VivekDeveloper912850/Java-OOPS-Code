import java.util.Scanner;
public interface MiniProject
{
	void Add(double f,double y);
	void Subtract(double f,double y);
	void Multiply(double f, double y);
	void Devide(double f,double y);

}
class Test implements MiniProject
{
	public void Add(double f,double y)
	{
		double p=f+y;
		System.out.println("Add of two number: " + p);
	}
	public void Subtract(double f,double y)
	{
		double a=f-y;
		System.out.println("Subtract of two number: " + a);
	}
	public void Multiply(double f,double y)
	{
		double d=f*y;
		System.out.println("Multiply of two number: " + d);
	}
	public void Devide(double f,double y)
	{
		double s=f/y;
		System.out.println("Devide of two number: " + s);
	}
	
}
class Check{
	public static void main(String [] args)
	{
		MiniProject t=new Test();
		String word;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number");
		int a=sc.nextInt();
		System.out.println("Enter a Secomd number");
		int b=sc.nextInt();
		System.out.println("Enter a Symbol +,-,*,/");
		String sys=sc.next();
		switch(sys)
		{
			case "+":  t.Add(a,b);
			break;
			case "-": t.Subtract(a,b);
			break;
			case "*": t.Multiply(a,b);
			break;
			case "/": t.Devide(a,b);
			break;
			default : System.out.println("This is a invalid Symbol");
			break;

		}System.out.println("Do you want to continue to Click y and Exit n");
		 word=sc.next();
	    }while(word.equals("y") || word.equals("Y"));
	    System.out.println("Thank you using your Service.");

	}
}
