import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither Increasing nor Decreasing");
        }
    }
}