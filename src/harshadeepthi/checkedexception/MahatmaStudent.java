package harshadeepthi.checkedexception;

public  class MahatmaStudent extends StudentAbstraction {
    public String percentage(){
        return "80";
    }

    @Override
    public String qualification() {
        return "MCA,MA,Btech,BE";
    }
    public MahatmaStudent getMahatmaStudent()throws CloneNotSupportedException{
            MahatmaStudent mahatmaStudent = null; 
            try{
                Object object=clone();
                 mahatmaStudent=(MahatmaStudent)object;
                 //return mahatmaStudent;
                //return(MahatmaStudent)clone();
            }
            catch(CloneNotSupportedException e){
                System.out.println("when exception comes class doesnot impliment cloneable interface");
            }
     return mahatmaStudent;
    }

}
