package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private ArrayLst<MenuItem menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Allow for default constructor


    public ArrayLst<MenuItem getMenuItems() {
        return menuItems;
    }
}
