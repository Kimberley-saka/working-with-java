//Switch Case Statement
import java.util.Scanner;
public class SwitchCase {
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter another number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter an operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        switch(operation) {
            case "+":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else{
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
                break;
            
            default:
                System.out.printf("%s not suported", operation);
                break;
        }
    }
    
}
