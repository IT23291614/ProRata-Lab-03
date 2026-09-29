import java.util.Scanner;

public class IT23291614Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = scanner.nextDouble();

        double total = price * kg;

        System.out.println("The total amount is: " + total);

        scanner.close();
    }
}