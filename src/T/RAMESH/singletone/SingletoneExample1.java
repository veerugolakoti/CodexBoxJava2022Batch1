package T.RAMESH.singletone;

public class SingletoneExample1 {
    public static SingletoneExample1 singletonevariable1;     // data type is class name

    private SingletoneExample1() {   //not possible create out side variable intilisation
        System.out.println("iam in side constructor");
    }
    public static SingletoneExample1 getSingletoneExample1(){  //singletontExample1 is method return type
        if (singletonevariable1 == null ){
            singletonevariable1= new SingletoneExample1();
        }
        return singletonevariable1;

    }
}
