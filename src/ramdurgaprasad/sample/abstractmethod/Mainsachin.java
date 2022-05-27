package ramdurgaprasad.sample.abstractmethod;

public class Mainsachin {
    public static void main(String[] args) {
        Sara s=new Sara("sachin daughter is sara of age:",23);
        System.out.print(s.what);
        System.out.print(s.age);
        System.out.print(s.famous());
        System.out.print(s.cricketer());
        System.out.println();
        Arjun a = new Arjun("Arjun tendulkar", 23);
        a.getAge();


        System.out.print(s.cricketer());
        System.out.println(s.famous());

    }
}
