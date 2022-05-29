package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysForReading = Integer.parseInt(scanner.nextLine());

        int timeNeeded = pagesCount / pagesPerHour;
        int result = timeNeeded / daysForReading;

        System.out.print(result);
    }
}
