import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Hello, type your name: ");
        String name = read.nextLine();
        System.out.println("Hello, " + name);
        read.close();
    }
}
