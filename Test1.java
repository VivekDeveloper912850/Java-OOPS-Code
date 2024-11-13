public class Test1{ 
public static void main(String [] args)
{
ApplicationContext  applicationContext =ApplicationContext.getApplicationContext();
ApplicationContext  applicationContext1 =ApplicationContext.getApplicationContext();
ApplicationContext  applicationContext2 =ApplicationContext.byApplicationContext();
ApplicationContext  applicationContext3 =ApplicationContext.byApplicationContext();

System.out.println("applicationContext reference" + applicationContext);
System.out.println("applicationContext reference" + applicationContext1);
System.out.println("**********************************************************************");
System.out.println("applicationContext reference" + applicationContext2);
System.out.println("applicationContext reference" + applicationContext3);

}

}
// singleton/doubleton design pattern
class ApplicationContext{

private ApplicationContext(){
System.out.println("inside ApplicationContext()");
}

static ApplicationContext applicationContext=new ApplicationContext();
static ApplicationContext applicationContext1=new ApplicationContext();
public static ApplicationContext byApplicationContext()
{
	return applicationContext1;
}

public  static ApplicationContext getApplicationContext(){
return applicationContext;
}
}