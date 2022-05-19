package rehana.sample.Stringimmutability;

public class ImmutabilityExample {

        private final String name;
        private final int date;
        private final String day;

    public ImmutabilityExample(String name, int date, String day) {
        this.name = name;
        this.date = date;
        this.day = day;
    }

    public String getName() {
            return name;
        }

        public int getDate() {
            return date;
        }

        public String getDay() {
            return day;
        }



        }

