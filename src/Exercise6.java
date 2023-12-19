import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hour Calculator (Integers)");
        System.out.print("Enter the current hour: ");
        int current = read.nextInt();
        System.out.print("Enter the hours quantity: ");
        int quantity = read.nextInt();
        int result = (current + quantity) % 24;
        System.out.println("In " + quantity + " hours, the clock will strike: " + result);
        read.close();
    }
}
