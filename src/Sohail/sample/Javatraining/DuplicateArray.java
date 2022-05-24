package Sohail.sample.Javatraining;

public class DuplicateArray {
    public void m2() {
        int count=0;
        int[] arr = {20, 30, 30, 30, 80, 20, 20, 20};
        for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                        if ((arr[i]/arr[j])==1) {
                            System.out.println("The Duplicate Element are : " + arr[i]);
                        }
                    break;


                }
            }
        }
    }




