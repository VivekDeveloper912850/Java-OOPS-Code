
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
		double b=f+y;
		System.out.println("Add of two number: " + b);
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
	public void Area(double f,double y)
	{
		double z=f*y;
		System.out.println("Area of rectangle: " + z);

	}
}
class Check{
	public static void main(String [] args)
	{
		MiniProject t=new Test();
		t.Add(576.56,45.0);
		t.Subtract(5657.5,555.89);
		t.Multiply(45.0,45.0);
		t.Devide(45.0,5.0);
		t.Area(465.8,67.0);

	}
}
