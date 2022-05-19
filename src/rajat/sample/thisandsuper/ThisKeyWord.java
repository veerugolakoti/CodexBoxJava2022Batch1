package rajat.sample.thisandsuper;

public class ThisKeyWord {
    int a,b,i,j,k;
   public  ThisKeyWord(int a, int b){
        System.out.println("Constructor value::"+a+" "+b);
        this.a=6;
        this.b=3;
        this.getVariable();

    }
    public ThisKeyWord(int i,int j,int k){

       this(1,2);
        System.out.println("3Parameter constructor:;"+i+" "+j+" "+k);
        this.i=i;
        this.j=j;
        this.k=k;

    }
    public void getInStanceVariable(){

        System.out.println("The value of a using this keyword::"+a);
        System.out.println("The value of b using this KeyWord::"+b);
    }
    public void getVariable(){
        System.out.println("Assign local into instance variable using this keyWord i::"+i);
        System.out.println("Assign local into instance variable using this keyWord j::"+j);
        System.out.println("Assign local into instance variable using this keyWord k::"+k);
    }

}
