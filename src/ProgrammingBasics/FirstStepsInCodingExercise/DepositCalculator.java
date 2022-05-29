package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int mouths = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double interest = depositAmount * percent;
        double interestPerMouth = interest / 1200;
        double finalPrice = depositAmount + mouths * interestPerMouth;

        System.out.print(finalPrice);

    }
}
