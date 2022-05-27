package JavaTraining.flowcontrol;

public class FlowControllers {
    public static void main(String[] args) {
        double h = 7.8;
        int y = 1;
        for (int k = 1; k <= 10; ++k) {
            h = h * k;
            System.out.println("the value of=" + h);
        }
        int h1 = 13;
        while (y < 16) {
            System.out.println(h1);
            y++;
        }
        int r = 0;
        do {
            System.out.println(("ram"));
            r++;
        } while (r > 6);
    }

    }

