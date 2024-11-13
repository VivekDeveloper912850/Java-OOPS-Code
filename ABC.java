class ABC
{   
    void methodABC()
    {
        System.out.println(111);
    }
     
    void methodABC(int i)
    {
        System.out.println(222);
    }
}
 
class XYZ extends ABC
{
    @Override
    void methodABC(int i)
    {
        super.methodABC(20);
        System.out.println(333);
    }
     
    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}
 
 class MainClass
{
    public static void main(String[] args)
    {
        ABC abc = new XYZ();
         
        abc.methodABC(10);
         
        abc.methodABC();
    }   
}