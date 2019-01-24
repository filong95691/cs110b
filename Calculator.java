/*
 * Fil Ong, pong7@mail.ccsf.edu
 * CS11B, Professor Mahalingam
 * 1/23/19
 * Calculator: inputs are 2 doubles.  outputs are results from calculator behavior like add, subtract.
 */
import java.util.Scanner;

public class Calculator{
	
	// state or characteristic of Calculator
	double input1;
	double input2;
	double result;
	
	// behavior or functionalities of Calculator
	public void add() {
		result = input1 + input2;
	}
	
	public void subtract() {
		result = input1 - input2;
	}

	public void multiply() {
		result = input1 * input2;
	}
	
	public void divide() {
		result = input1 / input2;
	}

	public void power() {
		result = Math.pow(input1, input2);
		
	}
	
	public void squareRoot() {
		result = Math.sqrt(input1);
		
	}

	public void absolute() {
		result = Math.abs(input1);
		
	}	
	
	public void floor() {
		result = Math.floor(input1);	
	}	
	
	public void ceiling() {
		result = Math.ceil(input1);	
	}	
	
	public void factorial() {
		result = input1;
        for (int factor = 2; factor < input1; factor++) {
            result *= factor;
        }
	}
	
	
	public static void main(String[] args)
	{
		
		Calculator myCalculator = new Calculator();
		System.out.println("Enter the first number");
		
		//Scan inputs
		Scanner scan = new Scanner(System.in);
		myCalculator.input1 = scan.nextDouble();
				
		System.out.println("Enter the second number");
		Scanner scan2 = new Scanner(System.in);
		myCalculator.input2 = scan2.nextDouble();
		
		//Calculate and Print results
		myCalculator.subtract();
		System.out.println(myCalculator.input1 + " - " + myCalculator.input2 + " = "  + myCalculator.result);

		myCalculator.add();
		System.out.println(myCalculator.input1 + " + " + myCalculator.input2 + " = "  + myCalculator.result);

		myCalculator.multiply();
		System.out.println(myCalculator.input1 + " * " + myCalculator.input2 + " = "  + myCalculator.result);

		myCalculator.divide();
		System.out.println(myCalculator.input1 + " / " + myCalculator.input2 + " = "  + myCalculator.result);

		myCalculator.power();
		System.out.println(myCalculator.input1 + " ^ " + myCalculator.input2 + " = "  + myCalculator.result);

		myCalculator.squareRoot();
		System.out.println(myCalculator.input1 + " square root " + " = "  + myCalculator.result);
		
		myCalculator.absolute();
		System.out.println(myCalculator.input1 + " absolute number " + " = "  + myCalculator.result);

		myCalculator.floor();
		System.out.println(myCalculator.input1 + " floor " + " = "  + myCalculator.result);

		myCalculator.ceiling();
		System.out.println(myCalculator.input1 + " ceiling " + " = "  + myCalculator.result);

		myCalculator.factorial();
		System.out.println(myCalculator.input1 + "! " + " = "  + myCalculator.result);

	}
}