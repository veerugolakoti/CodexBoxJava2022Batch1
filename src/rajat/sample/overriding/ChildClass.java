package rajat.sample.overriding;

public class ChildClass extends ParentClass {
    int i=88,j=87;
    public void add() {
        int v = i + j;
        System.out.println("The Child class value is::"+v);
    }
        public void mul(){
            int y =i*j;
            System.out.println("The child class Value::"+y);
        }
    }

