package ganesh.sample.stringoperations;

public class mutableApplication {
    public   void m1(){
        StringBuffer sb = new StringBuffer("leela");
        sb.append("ganesh");
        System.out.println(sb.hashCode());
    }

}
