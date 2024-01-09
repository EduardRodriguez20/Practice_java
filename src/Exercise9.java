import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Longer Word");
        System.out.print("Word 1: ");
        String w1 = read.nextLine();
        System.out.print("Word 2: ");
        String w2 = read.nextLine();
        if (w1.length() > w2.length()) {
            int x = w1.length() - w2.length();
            System.out.println("The word " + w1 + " has " + x + " more letters than " + w2);
        }else if (w1.length() < w2.length()) {
            int x = w2.length() - w1.length();
            System.out.println("The word " + w2 + " has " + x + " more letters than " + w1);
        }else {
            System.out.println("The words have the same lenght");
        }
        read.close();
    }
}
