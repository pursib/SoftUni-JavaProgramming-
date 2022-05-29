package ProgrammingBasics.FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yards = Double.parseDouble(scanner.nextLine());
        double yardPrice = yards * 7.61;
        double discount = yardPrice * 0.18;
        double finalPrice = yardPrice - discount;

        System.out.printf("The final price is:%f lv." +
                "The discount is: %f lv.", finalPrice, discount);

    }
}
