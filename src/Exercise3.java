import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the note 1: ");
        double note1 = read.nextDouble();
        System.out.print("Enter the note 2: ");
        double note2 = read.nextDouble();
        System.out.print("Enter the note 3: ");
        double note3 = read.nextDouble();
        System.out.print("Enter the note 4: ");
        double note4 = read.nextDouble();
        double total = (note1 + note2 + note3 + note4) / 4;
        System.out.println("The average is: " + total);
        read.close();
    }
}
