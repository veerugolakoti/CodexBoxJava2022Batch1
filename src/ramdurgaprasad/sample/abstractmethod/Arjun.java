package JavaTraining.abstractmethod;

public class Arjun extends SachinTendulkar {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Arjun(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    String cricketer() {
        return "he is cricketer but noy played a single recognised match";
    }

    @Override
    String famous() {
        return "still famous";
    }
}
