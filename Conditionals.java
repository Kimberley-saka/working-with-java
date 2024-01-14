/*conditional statements */
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] srgs) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter another number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter an operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        if(operation.equals("+")) {
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        } else if(operation.equals("-")) {
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);

        } else if(operation.equals("*")) {
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        } else if(operation.equals("/")) {
            if(num2 == 0) {
                System.out.println("Cannot divide by zero");
            } else{
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
            
        }
        
        else {
            System.out.printf("%s not suported", operation);
        }



        scanner.close();

    }
    
}
