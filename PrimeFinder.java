
public class PrimeFinder {
	 
	 void findPrime(int num) {
		 boolean isPrime=false;
		 if(num==1) {
				isPrime=false;
			}
			else if(num==2) {
				isPrime=true;
			}
			else {
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						isPrime=false;
						break;
					}
					else {
						isPrime=true;
					}
				}
			if(isPrime==false) {
					System.out.println("The number is not a prime number");
				}
			else {
					System.out.println("The number is a prime number");
				}
			}
	 }
}
