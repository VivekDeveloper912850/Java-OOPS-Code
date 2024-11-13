class X5
{   
    void methodOfX()
    {
        System.out.println("Class X");
    }
}
 
class Y extends X5
{
    @Override
    protected void methodOfX()
    {
        System.out.println("Class Y");
    }
}
 
class Z extends Y
{
    @Override
    public void methodOfX()
    {
        System.out.println("Class Z");
    }
}