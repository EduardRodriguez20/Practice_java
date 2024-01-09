import java.util.Scanner;

public class Exercise13{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Tennis set");
        System.out.print("Games won for A: ");
        int a = read.nextInt();
        System.out.print("Games won for B: ");
        int b = read.nextInt();
        if ((a == 6 && ((a-b) >= 2)) || (a == 7 && (b == 6 || b == 5))) {
            System.out.println("Won A");
        }else if ((b == 6 && ((b-a) >= 2)) || (b == 7 && (a == 6 || a == 5))) {
            System.out.println("Won B");
        }else if (((a > 7 || b > 7) || ((a == 7 && b < 6) || (b == 7 && a < 6))) || a == b) {
            System.out.println("Invalid");
        }else if (((a >= 5 || b >= 5) && ((a-b) == 1 || (b-a) == 1)) || (a < 5 || b < 5)) {
            System.out.println("It is not over");
        }
        read.close();
    }
}