import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Matthew Calculator :)");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("------");
        System.out.println("1. Addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");

        int choice = scanner.nextInt();

        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        switch(choice){
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                        case 4:
                            System.out.println("Result: " + (num1 / num2));
                            break;
                            default:
        }

    }
}