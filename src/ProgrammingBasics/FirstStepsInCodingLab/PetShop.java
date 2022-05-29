package ProgrammingBasics.FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsNumber = Integer.parseInt(scanner.nextLine());
        int petsNumber = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = dogsNumber * 2.50;
        double petsFoodPrice = petsNumber * 4;
        double finalPrice = dogFoodPrice + petsFoodPrice;

        System.out.printf("%f lv.", finalPrice);
    }
}