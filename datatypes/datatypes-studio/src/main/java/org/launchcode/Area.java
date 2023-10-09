package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Basic solution
//        System.out.println("Enter a radius: ");
//        double radius = input.nextDouble();
//        double area = Circle.getArea(radius);
//        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);


      //Bonus Mission 1 syntax added for if user enters a negative number or a non-numeric character
        System.out.println("Enter a radius: ");

        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();

            if (radius > 0) {
                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
            } else {
                System.out.println("Sorry, the radius must be a positive number");
            }
        } else {
            System.out.println("Sorry, that was not a valid number");
        }

        // while or do-while loop to re-prompt user


        input.close();
    }

}
