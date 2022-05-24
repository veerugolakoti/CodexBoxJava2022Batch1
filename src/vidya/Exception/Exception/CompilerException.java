package vidya.Exception.Exception;

public class CompilerException {
    public int Age = 18;
    public String name = "vv";


    public void CompilerException(int Age, String Name) {
        if (Age < 18) {
            try {
                throw new VidyaChecked(13, "not valid for vote");
            } catch (VidyaChecked e) {
                System.out.println(e.getMessage());
            }


        }
    }


}
