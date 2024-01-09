import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LocalDate current = LocalDate.now();
        // String current = DateTimeFormatter.ofPattern("MM dd yyyy").format(LocalDateTime.now());
        System.out.println(current);
        System.out.println("Type your date of birth");
        System.out.print("Day: ");
        int day = read.nextInt();
        System.out.print("Month: ");
        int month = read.nextInt();
        System.out.print("Year: ");
        int year = read.nextInt();
        LocalDate birth = LocalDate.of(year, month, day);
        int age = current.getYear() - birth.getYear();
        // classic form
        boolean verify = birth.getMonthValue() < current.getMonthValue()
                || (birth.getMonthValue() == current.getMonthValue()
                && birth.getDayOfMonth() <= current.getDayOfMonth());
        if (!verify) {
            age--;
        }
        if (current.getMonthValue() == birth.getMonthValue() 
                    && birth.getDayOfMonth() == current.getDayOfMonth()) {
            System.out.println("Happy Birthday");
        }
        // new form
        // Period p = Period.between(birth, current);
        // int age = p.getYears();
        System.out.println("You has " + age + " years old");
        read.close();
    }
}
