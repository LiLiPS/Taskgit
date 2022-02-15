import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Javafile{
	public BigInteger add(BigInteger a, BigInteger b){
        System.out.println("This is add method");
        System.out.println("This is add method for 2 params");
        return a.add(b);
    }

    public BigInteger add(BigInteger a, BigInteger b, BigInteger c){
        System.out.println("This is add method for 3 params");
        return a.add(b).add(c);
    }

    public BigInteger add(BigInteger a, BigInteger b, BigInteger c, BigInteger d){
        System.out.println("This is add method for 4 params");
        return a.add(b).add(c).add(d);
    }

    public BigInteger sub(BigInteger a, BigInteger b){
        return a.subtract(b);
    }

    public BigInteger div(BigInteger a, BigInteger b){
        return a.divide(b);
    }

    public BigInteger mult(BigInteger a, BigInteger b){
        return a.multiply(b);
    }

    public BigDecimal sqrtMethod(BigDecimal a){
        double d = a.doubleValue();
        return new BigDecimal(Math.sqrt(d));
    }

    public static void main(String[] args) {
    }
}