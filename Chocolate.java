/*
 * @class: Chocolate
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 1st, 2023
 * @description: This will calculate a new quantity of bags with 3 chocolates
 * as opposed to having an initial quanity of bags with 2 chocolates.
 * My variables are bagsIntial, chocolateInitial, chocolateFinal, chocolate, and bagsFinal.
 */
public class Chocolate {
    public static void main(String[] args) {
        int bagsInitial = 9;
        int chocolateInital = 2;
        int chocolateFinal = 3;
        int chocolate = bagsInitial * chocolateInital; // Calculates the total amount of chocolate available.
        int bagsFinal = chocolate / chocolateFinal; // Takes the total amount of Chocolate and calculates new amount of bags needed.
        System.out.println("The total amount of bags needed will be " + bagsFinal +".");
        System.out.println("These bags contain " +chocolateFinal + " chocolates each." );
    }
}
