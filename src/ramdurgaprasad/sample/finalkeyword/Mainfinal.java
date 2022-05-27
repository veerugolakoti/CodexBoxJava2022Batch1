package ramdurgaprasad.sample.finalkeyword;

public class Mainfinal {
    public static void main(String[] args) {
        Immutability immut= new Immutability("rohit sharma",45,"41","24-04-1982","batsman");
        System.out.println("name of the cricketer:"+ immut.getCrickter());
        System.out.println(immut.getJersy()+":jersy number");
        System.out.println("catergory of the crickter:"+ immut.getCategory());
        System.out.println(immut.getCenturies()+"-centuries");
        System.out.println(immut.getBirth()+":date of birth");

    }
}
