import java.lang.Math;

public class Javafile{
	public int add(int a, int b){
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}

	public int div(int a, int b){
		return a / b;
	}

	public int mult(int a, int b){
		return a * b;
	}

	public double sqrtMethod(double a){
		return Math.sqrt(a);
	}

	public static void main(String[] args) {
		Javafile jf = new Javafile();
		jf.add(5,5);
		jf.sub(4,3);
		jf.div(6,2);
		jf.mult(3,2);
		jf.sqrtMethod(25.0);
	}
}