import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hypotenuse Calculator");
        System.out.print("Enter the length of cathetus A: ");
        double a = read.nextDouble();
        System.out.print("Enter the length of cathetus B: ");
        double b = read.nextDouble();
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse is: " + h);
        read.close();
    }
}
