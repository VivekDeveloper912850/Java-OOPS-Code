class PQR
{   
    String myMethod(String s)
    {
        return s+s;
    }
}
 
class ABC extends PQR
{
    String myMethod(String s, double d)
    {
        return myMethod(s+d);
    }
}
 
class XYZ extends ABC
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);
    }
}
 
 class MainClass
{
    public static void main(String[] args)
    {
        XYZ xyz = new XYZ();
         
        System.out.println(xyz.myMethod("JAVA", 23.23, 111));
    }   
}