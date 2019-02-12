package source;

public class BasicOperations {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public int modulo(int num1, int num2) {
		return num1 % num2;
	}
	
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	public boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i=2; i<num; i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
