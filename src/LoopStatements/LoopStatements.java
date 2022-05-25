package LoopStatements;

public class LoopStatements {
    public static void main(String[] args) {
        int c = 2;
        do {
            c = 2;
            System.out.println(c);
            c--;
        }
        while (c < 0);

        String Array[]={"jhanu","sony","priya"};
        for(String X:Array){
            System.out.println(X);
        }
        int marks=10;
        for(int i=1;i<=5;i++) {
            marks=marks+i;
            System.out.println("marks:"+marks);
        }
    }
}
