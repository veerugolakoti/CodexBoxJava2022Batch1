package Abhilash.interfaceExamples;


public class Main {
    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.s = "CODEX BOX";
        System.out.println("Actual data is: " + interfaceExample.s);
        InterfaceExample s1 = null;
        try {

            Employee employee = (Employee) interfaceExample.getInterfaceExample();
        } catch (ClassCastException ex) {
            System.out.println("I'm intended to get Classcast exception");
        }
//        catch (CloneNotSupportedException e) {
//            System.out.println("I'm intended to get CloneNotSupportedException exception");
//        }

            interfaceExample.s = "Hyderbad";
            System.out.println("Cloned data is:" + interfaceExample.s);


        }
    }

