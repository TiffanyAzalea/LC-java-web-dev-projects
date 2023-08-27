package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of this rectangle? : ");
        int length = input.nextInt();


        //Scanner width = new Scanner(System.in);
       System.out.println("What is the width of the rectangle? : ");
       int width = input.nextInt();

       int area = length * width;
       System.out.println("The area of your rectangle is " + area);
    }
}
