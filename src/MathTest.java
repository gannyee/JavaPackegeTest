
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define a double type variable
		double a = 12.81;
		//Transfer double type to int type, remove decimal places
		int b = (int)a;
		System.out.println("Force Type Transfer: " + b);
		//Calling round() function, rounding
		long c = Math.round(a);
		System.out.println("Rounding: " + c);
		//Calling floor() function, return the Maximum Integer less than Parameters
		double d = Math.floor(a);
		System.out.println("floor: " + d);
		//Calling ceil() function, return the Minimum Integer greater than Parameters
		double e = Math.ceil(a);
		System.out.println("ceil: " + e);
		//Calling random() function, Create random float in [0,1)
		double x = Math.random();
		System.out.println("Randoms: " + x);
		//Calling random() function, Create random integer in [0,99)
		int y = (int)(Math.random() * 99);
		System.out.println("Create random integers in [0,99): " + y);
	}

}
