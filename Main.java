import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Hi %s. How old are you? ", name);

        int age = Integer.parseInt(scanner.nextLine());  

        System.out.printf("You are %d years old", age);

        scanner.close();
    }

}