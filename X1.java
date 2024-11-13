class X1
{
      void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
    static{
        System.out.println("this is a static block");
    }
    {
        System.out.println("THIS IS A INSTANCE BLOCK");
    }
}
 
class Y extends X1
{
    @Override
     void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
    static{
        System.out.println("this is a sub class static block");
    }
    {
        System.out.println("this is a sub class instance block");
    }
}
 
class Z extends Y
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
 
 class MainClass 
{   
    public static void main(String[] args)
    {
        X1 x = new Y();
         
        x.calculate(10, 20);
         
        Y y = (Y) x;
         
        y.calculate(50, 100);
        Y r=new Z();
         
        Z z = (Z) r;
         
        z.calculate(100, 200);
    }
}