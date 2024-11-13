class B
{
    public B(int i)
    {
        System.out.println(myMethod(i));
    }
     
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
 
class A extends B
{
    public A(int i, int j)
    {
        super(i*j);
         
        System.out.println(myMethod(i, j));
    }
     
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
 
 class MainClass
{
    public static void main(String[] args)
    {
        A a = new A(12, 21);
    }   
}