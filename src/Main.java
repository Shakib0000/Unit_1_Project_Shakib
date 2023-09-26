// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // User Inputs

        System.out.print("Enter the total bill: ");
        String input = s.nextLine();
        double billInput = Double.parseDouble(input);

        System.out.print("Enter the tip percentage as a whole number with no percentage sign: ");
        input = s.nextLine();
        double tipPercentage = Double.parseDouble(input);
        tipPercentage /= 100; // Percents have to be divided by 100 to be used in calculations.

        System.out.print("Enter the number of people in the party: ");
        input = s.nextLine();
        int numberOfPeople = Integer.parseInt(input);

        // Calculations

        double tipAmount = billInput * tipPercentage;
        double tipAmountPerPerson = tipAmount / numberOfPeople;
        double totalAmount = billInput + tipAmount;
        double totalAmountPerPerson = totalAmount / numberOfPeople;

        // Output

        System.out.println();
        System.out.println("The total tip amount is: " + String.format("%.2f", tipAmount));
        System.out.println();
        System.out.println("The total bill including tip is: " + String.format("%.2f", totalAmount));
        System.out.println();
        System.out.println("The tip amount per person is: " + String.format("%.2f", tipAmountPerPerson));
        System.out.println();
        System.out.println("The total amount per person is: " + String.format("%.2f", totalAmountPerPerson));
    }
}