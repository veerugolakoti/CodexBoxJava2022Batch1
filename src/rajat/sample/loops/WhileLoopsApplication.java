package rajat.sample.loops;

public class WhileLoopsApplication {
    public static void main(String[] args) {
        int empId=100;
        while( empId<150){
            System.out.println("rajat");
            if(empId==125){
                System.out.println("Team one completed all the assignment");
                break;
            }
            empId++;
        }
    }
}
