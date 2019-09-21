import java.util.Scanner;

public class BMI {

	public static void main(String [] args) {
	
		Scanner inputObj = new Scanner(System.in);
		double height = 0;
		double weight = 0;
		double bmi = 0;
		int formula = 0;
		
		System.out.print("Imperial or Metric? (1 or 2): ");
		formula = inputObj.nextInt();
		
		System.out.print("Height?: ");
		height = inputObj.nextDouble();
		
		System.out.print("Weight?: ");
		weight = inputObj.nextDouble();
		System.out.println();
		
		switch(formula) {
		
		case 1:
			bmi = ((703 * weight)/(height * height));
			break;
		case 2:
			bmi = (weight/(height * height));
			break;
		}
		
		System.out.print("Your BMI is: ");
		System.out.printf("%.1f", bmi);
		System.out.println();
		System.out.println("The BMI scale is: \n" +
							"Underweight = <18.5\n" + 
							"Normal weight = 18.5–24.9\n" + 
							"Overweight = 25–29.9\n" + 
							"Obesity = 30 or greater");
		
		inputObj.close();
	}
}
