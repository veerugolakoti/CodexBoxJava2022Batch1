package Vasusample.Exceptionhandling.CheckedException;

public abstract class Employee {
    private String name;
    private int id;
    private String Adress;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
    abstract String careerpersentage();
   abstract String qualification();




}