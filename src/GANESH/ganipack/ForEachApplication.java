package GANESH.ganipack;

public class ForEachApplication {

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3};
        for(int ar: arr) {
            System.out.println(ar);
        }
        String str[] = new String[]{"AAA", "BBB", "CCC"};
        for(String st: str) {
            System.out.println(st);
        }
        char ch[][] = new char[][]{{'A', 'B', 'C'}, {'G', 'H', 'I'}};
        for(char c[]: ch) {
            System.out.println(c);
        }
    }

}
