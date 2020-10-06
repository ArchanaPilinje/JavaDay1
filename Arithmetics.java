
public class Arithmetics {
	int num1,num2;
	float res=0;
	void add(int num1,int num2) {
		res=num1+num2;
		System.out.println("Result of Additiion of the 2 numbers:"+res);
	}
	void sub(int num1,int num2) {
		res=num1-num2;
		System.out.println("Result of Subtraction of the 2 numbers:"+res);
	}
	void mul(int num1,int num2) {
		res=num1*num2;
		System.out.println("Result of Multiplication of the 2 numbers:"+res);
	}
	void div(int num1,int num2) {
		res=num1/num2;
		System.out.println("Result of Division of the 2 numbers:"+res);
	}
}
