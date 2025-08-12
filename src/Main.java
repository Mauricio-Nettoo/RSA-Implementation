import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello, World!");

        // Prime numbers
        BigInteger q = BigInteger.valueOf(2).pow(521).subtract(BigInteger.ONE);
        BigInteger p = BigInteger.valueOf(2).pow(607).subtract(BigInteger.ONE);

        BigInteger n = p.multiply(q);
        BigInteger totientOfN = totient(q, p);
        BigInteger e = getRandomCoprime(n);
        BigInteger d = findD(e, totientOfN);

    }

    public static BigInteger rsaEncrypt(BigInteger message, BigInteger e, BigInteger n) {

    }

    public static BigInteger rsaDecrypt(BigInteger encryptedMessage) {}

    public static BigInteger findD(BigInteger e, BigInteger totient) {
        BigInteger i = BigInteger.ONE;
        while (true) {
            if (e.multiply(i).mod(totient).equals(BigInteger.ONE)) {
                return i;
            }
            i = i.add(BigInteger.ONE);
        }
    }

    public static BigInteger totient(BigInteger n1, BigInteger n2) {
        return n1.subtract(BigInteger.ONE).multiply(n2.subtract(BigInteger.ONE));
    }

    public static BigInteger euclidesMDC(BigInteger n1, BigInteger n2) {
        n1 = n1.abs();
        n2 = n2.abs();
        if (n1.equals(BigInteger.ZERO)) return n2;
        if (n2.equals(BigInteger.ZERO)) return n1;
        while (!n2.equals(BigInteger.ZERO)) {
            BigInteger rest = n1.mod(n2);
            n1 = n2;
            n2 = rest;
        }
        return n1;
    }

    public static boolean isCoPrime(BigInteger x) {
        return x.equals(BigInteger.ONE);
    }

    public static BigInteger getRandomCoprime(BigInteger n) {
        BigInteger i = BigInteger.ONE;
        ArrayList<BigInteger> coPrimes = new ArrayList<>();
        while (i.compareTo(n) < 0) {
            if (isCoPrime(euclidesMDC(n, i))) coPrimes.add(i);
            i = i.add(BigInteger.ONE);
        }
        return coPrimes.get(new Random().nextInt(coPrimes.size()));
    }
}
