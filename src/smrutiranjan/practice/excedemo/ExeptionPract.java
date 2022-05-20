package smrutiranjan.practice.excedemo;

public class ExeptionPract extends Throwable {
        //store account information
        private static int[] accno = {1001, 2045, 3403, 1704};

        private static String[] name = {"Nish", "Shubh", "Sakhsi", "Bobi", "Akash"};

        private static double[] bal = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

        ExeptionPract(String str) { super(str); }

        // write main()
        public static void main(String[] args)
        {
            try {
                // display the heading for the table
                System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                        "\t" + "BALANCE");

                // display the actual account information
                for (int i = 0; i < 5 ; i++)
                {
                    System.out.println(accno[i] + "\t" + name[i] +
                            "\t" + bal[i]);

                    // display own exception if balance < 1000
                    if (bal[i] < 2000)
                    {
                      ExeptionPract me =
                                new ExeptionPract("Balance is less than 1000");
                        throw me;
                    }
                }
            }

            catch (ExeptionPract e) {
                e.printStackTrace();
            }
        }
    }


