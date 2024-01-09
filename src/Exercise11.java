import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Organize numbers");
        System.out.print("Type the quantity of numbers: ");
        int quantity = read.nextInt();
        int numbers[] = new int[quantity];
        for(int x = 1; x <= quantity; x++){
            System.out.print("Type the "+ x +" number: ");
            int y = read.nextInt();
            numbers[x-1] = y;
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        read.close();
    }
}
