package rajat.sample.operators.logical;

public class LogicalOperationApplication {
    public void getLogicalOperatur() {
        int math=86,phy=44,chem=69,bio=77,fullMark=400;
        int total=math+phy+chem+bio;
        System.out.println(total);

        //use && operator
        if((math>35) && (phy>35) && (chem>35) && (bio>35)){
            System.out.println("pass all the subject");
        }else{
            System.out.println("Fail");
        }

        //use or(||) operator
       if((total<140) ||(total>260)){
           if(total<140){
               System.out.println("FAIL");
           }
           if(total>260){
               System.out.println("Pass with Distinction");
           }
       }
       //!
        boolean a,result;
       a=true;
       result=!a;
        System.out.println("call result::"+result);
        System.out.println(" call result using not operator::"+ !result);


    }
}
