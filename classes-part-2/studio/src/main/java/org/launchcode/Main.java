package org.launchcode;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem item1 = new MenuItem("Pepporoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course" );
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a s ide of pizza sauce", 6.89, "appetizer");
        MenuItem item3 = new MenuItem("Gooey Butter Cake", "The ooiest, gooiest dessert this side of the Mississippi", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

        System.out.println(item1);


        //TODO: Create menu
        Menu menu = new Menu();

        //TODO: Add item to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        //TODO: Remove an item and print menu
        menu.removeItem(item4);

        System.out.println(menu);

        //TODO: Test equals method
        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

        System.out.println(item5.equals(item6));

        //BONUS MISSION

        //TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added
        menu.addItem((item6));
        System.out.println(menu);

        menu.addItem(item1);
        System.out.println(menu);



    }
}
