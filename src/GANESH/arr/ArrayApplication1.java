package GANESH.arr;

import javax.xml.ws.soap.Addressing;

public class ArrayApplication1 {
    public static void main(String[] args) {

       float ar[] = new float[10];
        ar[0] = 100f;
        ar[1] = 200f;
        ar[2] = 300f;
        ar[3] = 400f;
        ar[4] = 500f;
        ar[5] = 600f;
        ar[6] = 700f;
        ar[7] = 800f;
        ar[8] = 900f;
        ar[9] = 1000f;
        for (int x = 0; x < ar.length; x++) {
            System.out.println(ar[x]);
        }


        long array[] = {20, 30, 40, 50, 60, 70, 80, 90, 10, 11, 22, 33, 44, 55, 66, 77, 88, 741258,};
        long max = array[0];


        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
                    System.out.println("The maximum number =" + max);
                }


            }





