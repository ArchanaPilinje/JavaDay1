import java.util.*;
public class BasicOperations {

	public static void main(String[] args) {
		Arithmetics op=new Arithmetics();
		System.out.println("Please enter the 2 number to perform mathematical operations");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		op.add(num1, num2);
		op.sub(num1, num2);
		op.mul(num1, num2);
		op.div(num1, num2);
		PrimeFinder prime=new PrimeFinder();
		System.out.println("Please enter the number to find out if it's prime or not");
		int p=sc.nextInt();
		prime.findPrime(p);
	}

}
