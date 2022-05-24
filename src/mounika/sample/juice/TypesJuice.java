package mounika.sample.juice;

import rajat.sample.interfaces.MyInterface;

public class TypesJuice  {
    String typeJuice ;

    public String getTypeJuice() {
        return typeJuice;
    }

    public void setTypeJuice(String typeJuice) {
        this.typeJuice = typeJuice;
    }

    public int getTypesize() {
        return Typesize;
    }

    public void setTypesize(int typesize) {
        Typesize = typesize;
    }

    int Typesize;

    public static void main(String[] args) {
        TypesJuice typesJuice=new TypesJuice();
        System.out.println(typesJuice.getTypeJuice());
        System.out.println(typesJuice.getTypesize());
    }
}
