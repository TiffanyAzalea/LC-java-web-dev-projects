package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for ( int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);



        System.out.println("Sum of even numbers in the list: " + sumEven(numberList) );
    }
}
