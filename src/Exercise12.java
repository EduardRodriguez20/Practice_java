import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Coronary heart disease risk condition");
        System.out.print("Type your height (cm): ");
        double height = read.nextDouble();
        System.out.print("Type your weight (kl): ");
        double weight = read.nextDouble();
        System.out.print("Type your age: ");
        int age = read.nextInt();
        double imc = weight / ((height / 100) * (height / 100));
        System.out.println("Your ICM is: " + imc);
        String condition = "";
        if (age < 45) {
            if (imc < 22.0) {
                condition = "low";
            }else{
                condition = "medium";
            }
        }else{
            if (imc < 22.0) {
                condition = "medium";
            }else{
                condition = "high";
            }
        }
        System.out.println("Your risk condition is " + condition);
        read.close();
    }
}
