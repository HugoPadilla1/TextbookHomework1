/*
 * @class: Circle
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 1st, 2023
 * @description: Calculates the area and displays area and perimeter of a circle.
 */

 public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("The circle with radius " + radius + " has a total area of " + area + " with a perimeter of " + perimeter + ".");
    }
 }