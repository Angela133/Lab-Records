import arithmetic.*;

public class Arithmetic_opt {
    public static void main(String[] args) {
    System.out.println("\nName : ANGELA MATHEW");
	System.out.println("Reg.No : SJC22MCA-2005");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Course Name : OOPS LAB");
	System.out.println("Date : 22 JUNE 2023");
	System.out.println("\n-------------------------------------------------------------\n");
        double num1 = 10;
        double num2 = 5;

        Arithmetic addition = new Addition();
        double sum = addition.calculate(num1, num2);
        System.out.println("Sum: " + sum);

        Arithmetic subtraction = new Subtraction();
        double difference = subtraction.calculate(num1, num2);
        System.out.println("Difference: " + difference);

        Arithmetic multiplication = new Multiplication();
        double product = multiplication.calculate(num1, num2);
        System.out.println("Product: " + product);

        Arithmetic division = new Division();
        double quotient = division.calculate(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}

