import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Calculator note");
        System.out.print("Enter the contest 1: ");
        int c1 = read.nextInt();
        System.out.print("Enter the contest 2: ");
        int c2 = read.nextInt();
        System.out.print("Enter the laboratory note: ");
        int lab = read.nextInt();
        double nc = (c1 + c2)/2;
        double c3 = (60 - (nc * 0.7 + lab * 0.3))/0.7; 
        System.out.print(c3);


        read.close();
    }
}
