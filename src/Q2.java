import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of water Alice have drunk today ? ");
        int water = input.nextInt();
        if (water >= 5000) {
            System.out.println("Yes, Alice is following doctor's advice");
        } else {
            System.out.println("No, Alice is not following doctor's advice");
        }
    }
}
