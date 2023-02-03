/*
 * @class: Cycle
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 1st, 2023
 * @description: This will solve for an unknown value of tricycles given a total amount of wheels and bicycles.
 * My variables are bicycleInitial, wheelsBicycle, wheelsTricycle, wheelsInitial, wheelsFinal, and tricycleInitial.
 */
public class Cycle {
    public static void main(String[] args){
        int bicycleInitial = 10;
        int wheelsBicycle = 2;
        int wheelsTricycle = 3;
        int wheelsInitial = 47;
        int wheelsFinal = wheelsInitial - (wheelsBicycle * bicycleInitial); // This calculation is used to calculate how many wheels I have for tricycles after taking away 10 bicycles.
        int tricycleInitial = wheelsFinal / wheelsTricycle;
        System.out.println("There are total of " + tricycleInitial + " tricycles as opposed to " + bicycleInitial + " bicycles.");
    }
}
