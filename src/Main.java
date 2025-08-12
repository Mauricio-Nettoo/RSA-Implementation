public class Main {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
    }

    public static int findD(int e, int totient) {
        int i = 1;
        while (true) {
            if (e * i % totient == 1) {
                return i;
            }
            i++;
        }
    }
}
