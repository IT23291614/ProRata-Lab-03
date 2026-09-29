import java.util.Scanner;

public class IT23291614Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        double otRate = scanner.nextDouble();

        double totalSalary = monthlySalary + (otHours * otRate);

        System.out.println("The total salary including OT is: " + totalSalary);

        scanner.close();
    }
}