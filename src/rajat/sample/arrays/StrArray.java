package rajat.sample.arrays;

public class StrArray {
    public void getStringArray() {

        String[] str = new String[]{"Rajat","Deepak","Kalu","Bhanaja"};

        for (String name:str) {
            System.out.println(name);
        }
        for (int i=0;i< str.length;i++){
            if(i==2){
                break;
            }
            System.out.println(str[i]);
        }
    }
}
