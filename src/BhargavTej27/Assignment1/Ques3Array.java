package BhargavTej27.Assignment1;

public class Ques3Array {
    public static void main(String[] args) {
        int a[]= new int[]{59,49,39,29,19};
        int max=0;
        for (int i = 0; i<a.length; i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
            System.out.print("Max value="+max);
    }
}