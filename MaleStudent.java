/*
 * @class: MaleStudent
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 1st, 2023
 * @description: A simple program that finds the difference between Male and Female Students
 * at a school.
 */
public class MaleStudent {
    public static void main(String[] args){
        int totalStudents = 389;
        int femaleStudents = 175;
        int maleStudents = totalStudents - femaleStudents;
        System.out.println("There are a total of " + maleStudents + " male students.");
    }
}
