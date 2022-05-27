package ramdurgaprasad.sample.javaassessment;

public class MaximumArrayApplication
{
    public static void main(String[] args)
    {

    int a[]=new int[]{-1,-34,10,-56,-78,2,45,56,46,46};
    int sai=0;
    for(int i=0;i<a.length;i++)
    {
        if (a[i] > sai)
        {
            sai = a[i];
        }
      }
    System.out.println("the maximum number of array:" + sai);


    }
}
