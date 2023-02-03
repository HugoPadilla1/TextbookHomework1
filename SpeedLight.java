/*
 * @class: SpeedLight
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 1st, 2023
 * @description: Calculates the distance to a lightning strike
 * given the speed of light and the duration of the lightning to thunder.
 * I will use variables, speedOfSound, timeElapsed, and distance.
 */
public class SpeedLight {
  public static void main(String[] args) {
    int speedOfSound = 340; 
    int timeElapsed =5; 
    int distance = timeElapsed * speedOfSound; // Calculates the distance of the lightning usen initial conditions.
    System.out.println("The lightning strike is " + distance + " meters away.");
  }
}