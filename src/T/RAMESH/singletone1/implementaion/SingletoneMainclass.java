package T.RAMESH.singletone1.implementaion;

import T.RAMESH.singletone.SingletoneExample1;

public class SingletoneMainclass {
    public static void main(String[] args) {
        SingletoneExample1 x = SingletoneExample1.getSingletoneExample1();
        SingletoneExample1 y = SingletoneExample1.getSingletoneExample1();
        System.out.println(x);
        System.out.println(y);

    }
}
