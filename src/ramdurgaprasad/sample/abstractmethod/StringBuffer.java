package JavaTraining.abstractmethod;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer sb=new java.lang.StringBuffer("i am PENAGANTI Ramdurgaprasad");
        System.out.println((sb));
        System.out.println(sb.length());
        System.out.println(sb.charAt(10));
        System.out.println(sb.capacity());
        System.out.println(sb.delete(0,20));
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb.indexOf("a",2));
        System.out.println(sb.insert(3,"sangam"));
        System.out.println(sb.append("prasad"));
        System.out.println(sb.substring(2,11));
        System.out.println(sb.replace(1,11,"er"));

        System.out.println(sb.reverse());

        }
    }

