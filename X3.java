class X3
{
    int method(int i)
    {
        return i *= i;
    }
}
 
class Y extends X3
{
    double method(double d)
    {
        return d /= d;  
    }
}
 
class Z extends Y
{
    float method(float f)
    {
        return f += f;
    }
}
 
 class MainClass
{
    public static void main(String[] args)
    {
        Z z = new Z();
         
        System.out.println(z.method(21));
    }
}