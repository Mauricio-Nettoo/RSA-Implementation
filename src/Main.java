import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello, World!");

        // Prime numbers
        BigInteger q = BigInteger.valueOf(2).pow(521).subtract(BigInteger.ONE);
        BigInteger p = BigInteger.valueOf(2).pow(607).subtract(BigInteger.ONE);

        BigInteger n = p.multiply(q);
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

    public static BigInteger totient(BigInteger n1, BigInteger n2) {
        return n1.subtract(BigInteger.ONE).multiply(n2.subtract(BigInteger.ONE));
    }

    public static BigInteger euclidesMDC(BigInteger n1, BigInteger n2) {
        while (n1.compareTo(n2) != 0) {
            if (n1.compareTo(n2) > 0) {
                n1 = n1.subtract(n2);
            } else {
                n2 = n2.subtract(n1);
            }
        }
        return n1;
    }
}
