package Java;

import java.io.BufferedReader;
import java.io.FileReader;

public class CalculatorProgram {

	static double a ; 
	static double b ;
	
	public static void main(String[] args) {
		Calculations calculations = new Calculations();
		try {
			String line;
			BufferedReader inputFile = new BufferedReader(new FileReader("Input.txt"));
			while ((line = inputFile.readLine()) != null) {
				String[] inputs = line.split("\\s+");
				a = Double.parseDouble(inputs[0]);
				b = Double.parseDouble(inputs[1]);
				double add = calculations.addition(a, b);
				System.out.println("Addition of " + a + " and " + b + " : " + add);
				double sub = calculations.subtraction(a, b);
				System.out.println("Subtraction of " + a + " and " + b + " : " + sub);
				double multi = calculations.multiplication(a, b);
				System.out.println("Multiplication of " + a + " and " + b + " : " + multi);
				double div = calculations.division(a, b);
				System.out.println("Division of " + a + " and " + b + " : " + div);
			}
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

}
