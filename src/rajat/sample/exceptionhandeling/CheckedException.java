package rajat.sample.exceptionhandeling;

public class CheckedException{
    private String name ;
    private  Long phNo;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhNo() {
        return phNo;
    }

    public void setPhNo(Long phNo) {
        this.phNo = phNo;
    }


    public CheckedException getCheckedException() throws CloneNotSupportedException{
//one way of writing Logic
       /* try {
            return (CheckedException) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The exception rise because of you cannot implement Cloneable interface");
        }


        return null;
    */
        //2nd way of writing Logic
     /*   CheckedException checkedException = null;
        try{
            Object object = clone();
            checkedException = (CheckedException) object;
        }catch (CloneNotSupportedException c){
            System.out.println("The exception rise because of you cannot implement Cloneable interface");
        }
        return checkedException;*/

        //3rd way of writing Logic using throws keyword
        return (CheckedException) clone();
    }

}
