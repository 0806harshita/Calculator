import java.util.Scanner;

public class Main {


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Cannot divide by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void showMenu() {
        System.out.println("\n📘 === Calculator Menu ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        System.out.println("📟 Welcome to the Calculator!");

        while (true) {
            showMenu();


            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input. Please enter a number between 1 and 5.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("👋 Thank you for using the calculator. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println(" Invalid number. Please try again.");
                    scanner.next();
                    continue;
                }
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println(" Invalid number. Please try again.");
                    scanner.next();
                    continue;
                }
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Sum of "+num1+" and "+num2+" is " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Difference of "+num1+" and "+num2+" is " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Product of "+num1+" and "+num2+" is "  + result);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        System.out.println("Division of "+num1+" and "+num2+" is "  + result);
                        break;
                }
            } else {
                System.out.println(" Invalid choice.  select a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
