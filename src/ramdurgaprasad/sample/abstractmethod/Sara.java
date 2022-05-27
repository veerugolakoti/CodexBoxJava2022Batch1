package ramdurgaprasad.sample.abstractmethod;

public class Sara extends SachinTendulkar{
    String what;
    int age;
    Sara(String edc, int ag){
        what=edc;
        age=ag;
    }
    @Override
    String cricketer() {
        return " R̥Because of sachin ";
    }

    @Override
    String famous() {
        return ",do nothing still famous";
    }
}
