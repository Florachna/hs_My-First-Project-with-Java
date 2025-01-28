package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bubblegumEarned = 202;
        int toffeeEarned = 118;
        int iceCreamEarned = 2250;
        int milkChocolateEarned = 1680;
        int doughnutEarned = 1075;
        int pancakeEarned = 80;
        double income = (double) bubblegumEarned + toffeeEarned + iceCreamEarned + milkChocolateEarned + doughnutEarned + pancakeEarned;

        System.out.printf("""
               Earned amount:
               Bubblegum: $%d
               Toffee: $%d
               Ice cream: $%d
               Milk chocolate: $%d
               Doughnut: $%d
               Pancake: $%d
               
               Income: $%.1f
               """, bubblegumEarned, toffeeEarned, iceCreamEarned, milkChocolateEarned, doughnutEarned, pancakeEarned, income);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();

        double netIncome = income - ((double) staffExpenses + otherExpenses);

        System.out.println("Net income: $" + netIncome);
    }
}