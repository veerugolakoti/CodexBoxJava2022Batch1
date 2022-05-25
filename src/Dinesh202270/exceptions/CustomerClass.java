package Dinesh202270.exceptions;

public class CustomerClass {



    public int customer1() {
        int[] items = null;
        try {
            items = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

            return items[9];

        } catch (Exception e) {
            System.out.println("exception occured at 30");
        }

            return 0;


        }

        public void customer2()
        {
            int a = 10;
            a = a / 0;

            System.out.println(a);

        }

    }


