import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRates {
    public double LB = 0.5;
    public double UB = 0.85;
    public int RHR = 70;
    String fName;
    String lName;
    LocalDate dateOfBirth;


    public HeartRates(String fName, String lName, LocalDate dateOfBirth) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;

    }

    public int averageHR() {
        return maximumHR() - RHR;
    }

    public double lowerBTHR() {
        return averageHR() * LB + RHR;
    }

    public double upperBTHR() {
        return averageHR() * UB + RHR;
    }

    public String targetHRR() {
        return "The Target Heart Rate Range is between " + lowerBTHR() + " and " + upperBTHR();
    }

    public int maximumHR() {
        return 220 - new AgeCalculator().calculateAge(dateOfBirth).getYears();
    }

    public String toString() {
        return "First name: " + fName + "\nLast name: " + lName + "\nAge: " + getAge() + "\nDate of Birth: " + dateOfBirth.toString() + "\nMaximum Hearth Rate: " + maximumHR();
    }


    public int getAge() {
        return java.time.Year.now().getValue() - dateOfBirth.getYear();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String fName = input.nextLine();
        System.out.println("Please, enter your last name:");
        String lName = input.nextLine();
        LocalDate dateOfBirth = new AgeCalculator().getBirthday();
        HeartRates p1 = new HeartRates(fName, lName, dateOfBirth);
        System.out.println(p1.targetHRR());
        System.out.println(p1);
    }
}
