import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Converter from Centimeter to Inches");
        System.out.print("Enter the CM: ");
        double cm = read.nextDouble();
        System.out.println(cm + " cm = " + (cm/2.54) + " in");
        read.close();
    }
}
