package BhargavTej27.Assignment1;

public class AssesmentTest1 {
    public static void main(String[] args){
//1.question
        //using integer
        int d=27,mo=4,y=1998,Lp=1;
        System.out.println("Before Swap:Date of Birth in DD.MM.YY= "+ d+"."+ mo+"."+y+"."+Lp);
        int t,t1;
        t=d;
        d=mo;
        mo=t;
        t1=y;
        y=Lp;
        Lp=t1;
        System.out.println("after swap:Date of Birth in DD.MM.YY="+ d+"."+ mo+"."+y+"."+Lp);
        //using float
        float k1=1.0f,l1=1.2f,r1;
        System.out.println("Before Swap:Rajini Kanth birthday="+ k1+","+ l1);
        r1=k1;
        k1=l1;
        l1=r1;
        System.out.println("After Swap:Rajini Kanth birthday="+ k1+","+ l1);
        //using double
        double PeP=119.49,DeP=105.49,AvP;
        System.out.println("Before Swap:petrol price="+PeP + " diesel price="+DeP);
        AvP=PeP;
        PeP=DeP;
        DeP=AvP;
        System.out.println("After Swap:diesel price="+PeP + " petrol price="+DeP);
        //using char
        char n='V',a='E',m='E',e='R',s='U';
        System.out.println("Our trainer name="+ n+a+m+e+s);


    }
}
