package Dhivya.sample.singletone;
public class SingletoneExample
{
    private static SingletoneExample st;
    private SingletoneExample()
    {
        System.out.println("Hello Singleton");
    }
    public static SingletoneExample getInstance()
    {
        if(st==null)
        {
            st=new SingletoneExample();
        }

        return null;
    }
}
