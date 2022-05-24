package rajat.sample.statement;

public class ContineuApplication {
    public void getContineu() {
        for (int i=1;i<=10;i++){
            if(i==5){
                continue;

            }
            System.out.println("Number="+i);
        }
    }
}
