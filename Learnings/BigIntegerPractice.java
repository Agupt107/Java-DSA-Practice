import java.math.*;

public class BigIntegerPractice {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("25678");
        BigInteger b = BigInteger.valueOf(1);

        BigInteger result = a.add(b);

        System.out.println(result);
    }
}

// now i know how to add numbers in String
// why use BigIntger? => cause lets say you have a String that passes the limit
// of int or long then
// we can use BigInteger cause this have no limit you can hold any number to
// this BigInteger class
// as in this code you will have to import the BigInteger from Math class and we
// can use its awesome
// fuctions there are more functions in this class