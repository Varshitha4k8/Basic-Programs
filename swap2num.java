package basicprograms;
import java.util.Scanner;

public class swap2num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("after swapping");
		System.out.println("first number" +num1);
		System.out.println("second number"+num2);
		
	}

}
