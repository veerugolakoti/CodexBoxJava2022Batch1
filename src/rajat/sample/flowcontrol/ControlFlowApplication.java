package rajat.sample.flowcontrol;




public class ControlFlowApplication {

    public static void main(String[] args) {
        //if
        int sId=202252;
        if(sId==202253){
            System.out.println("My Name is Rajat kumar Behera");
        }

        //if else
        int num1=89,num2=99;
        if(num1>num2){
            System.out.println("num1 is greater");
        }else{
            System.out.println("num2 is greater");
        }

        //Nested if
        int math=89,phy=56,chem=45;
        if(math>70){
            System.out.println("you are pass in math");
            if(phy>40){
                System.out.println("you are pass in physics");
                if(chem>30){
                    System.out.println("you are pass in chemistry");
                }

            }
        }

        //if else lader
        int a=30,b=45,c=15;
        if(a>b){
            System.out.println("Start subtraction="+(a-b));
        }else if(a>c){
            System.out.println("Start Addition="+(a+c));
        }else if(b>c){
            System.out.println("Start multiplication="+(b*c));
        }else{
            System.out.println(a+b+c);
        }

        //Switch case
        int month=13;
        String monthName;
        switch(month){
            case 1:
                monthName="january";
                break;
            case 2:
                monthName="february";
                break;
            case 3:
                monthName="march";
                break;
            case 4:
                monthName="april";
                break;
            case 5:
                monthName="may";
                break;
            case 6:
                monthName="june";
                break;
            case 7:
                monthName="july";
                break;
            case 8:
                monthName="august";
                break;
            case 9:
                monthName="september";
                break;
            case 10:
                monthName="october";
                break;
            case 11:
                monthName="november";
                break;
            case 12:
                monthName="december";
                break;
            default:
                monthName="Invalid month";
        }
        System.out.println("Month Name is::"+monthName);

        //Creation of Object
        ControlFlowApplication cfa=new ControlFlowApplication();
        //call NonStatic Method
        //cfa.searchDay();
        System.out.println("Program run successfully");

    }


}
