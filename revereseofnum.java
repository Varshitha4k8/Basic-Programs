package helloworld;

public class revereseofnum {
	public static void main(String[] args) {
	int num= 123;
	int reversedNumber = 0;
	while(num!=0) {
		int digit = num%10;
		reversedNumber = reversedNumber*10+digit;
		num/=10;
		}
	System.out.println(reversedNumber);
		
	}

}
