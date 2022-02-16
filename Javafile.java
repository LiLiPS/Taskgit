import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.logging.Logger;

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
    	Javafile jv = new Javafile();
        Logger logger = Logger.getLogger(jv.getClass().getName());
        logger.info("ADD with two Parameters "+ (jv.add(BigInteger.valueOf(10),BigInteger.valueOf(10))));
        logger.info("ADD with tree Parameters "+ (jv.add(BigInteger.valueOf(10),BigInteger.valueOf(10),BigInteger.valueOf(10))));
        logger.info("ADD with Four Parameters "+ (jv.add(BigInteger.valueOf(10),BigInteger.valueOf(10), BigInteger.valueOf(10), BigInteger.valueOf(10))));
        logger.info("SUB with two Parameters "+ jv.sub(BigInteger.valueOf(10),BigInteger.valueOf(3)));
        logger.info("DIV with two Parameters "+ jv.div(BigInteger.valueOf(10),BigInteger.valueOf(2)));
        logger.info("MULT with two Parameters "+ jv.mult(BigInteger.valueOf(10),BigInteger.valueOf(3)));
        logger.info("SQRT with two Parameters "+ jv.sqrtMethod(new BigDecimal (25)));
        System.out.println("Change!!!!");
        System.out.println("You chose this tipe of parameter: " + args[0]);
    }
}