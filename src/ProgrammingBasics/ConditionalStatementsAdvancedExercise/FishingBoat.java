package ProgrammingBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        int boatPrice = 0;

        switch (season){
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
        }
        double middlePrice = 0.0;

        if(fishermanCount<= 6){
            middlePrice = boatPrice - (boatPrice* 0.10);
        }else if(fishermanCount <= 11){
            middlePrice = boatPrice - (boatPrice*0.15);
        }else{
            middlePrice = boatPrice - (boatPrice * 0.25);
        }

        if(fishermanCount % 2 == 0 && !season.equals("Autumn")){
            middlePrice = middlePrice - (middlePrice * 0.05);
        }

        if(budget >= middlePrice){
            System.out.printf("Yes! You have %.2f leva left.",budget-middlePrice);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",middlePrice-budget);
        }
    }
}
