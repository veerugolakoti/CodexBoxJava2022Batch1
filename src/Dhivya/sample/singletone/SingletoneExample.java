package Dhivya.sample.singletone;
public class SingletoneExample
{
    public static SingletoneExample st;
    public SingletoneExample()
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
