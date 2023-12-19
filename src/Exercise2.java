import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = read.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        read.close();
    }
}
