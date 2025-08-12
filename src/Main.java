import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello, World!");

        // Prime numbers
        BigInteger q = BigInteger.valueOf(2).pow(521).subtract(BigInteger.ONE);
        BigInteger p = BigInteger.valueOf(2).pow(607).subtract(BigInteger.ONE);
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
