import java.util.Scanner;

public class CalculatoreBucky {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first number");
		a=sc.nextInt();
		
		System.out.println("Enter second number");
		b=sc.nextInt();
		
		c=(a+b);
		
		System.out.println();
		System.out.println("The sum is: "+ c);
	}

}
