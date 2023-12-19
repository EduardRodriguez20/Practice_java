import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Decimal part");
        System.out.print("Enter the number: ");
        double number = read.nextDouble();
        System.out.print(number - ((int) number));
        read.close();
    }
}
