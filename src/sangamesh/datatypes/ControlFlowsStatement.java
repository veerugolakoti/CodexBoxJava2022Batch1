package sangamesh.datatypes;
public class ControlFlowsStatement {
    public static void main(String[] args) {
        int a=1,b=4;
        //if condition
        if(a<b)
            System.out.println("a<b");
        //if-else condition
        if(a<b)
            System.out.println("a<b");
        else
            System.out.println("a>b");
        //nested-if condition
        if(a>b)
            System.out.println("a<b");
        if (a<b)
            System.out.println("a<b");
        //if-else-if ladderS
        if (a>b)
            System.out.println("a>b");
        else if (a<b)
            System.out.println("a<b");
        else if (a>b)
            System.out.println("a>B");



    }
}
