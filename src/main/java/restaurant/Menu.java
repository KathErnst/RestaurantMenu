package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
        ArrayList<MenuItem> appetizersList = new ArrayList<>();
        ArrayList<MenuItem> mainCoursesList = new ArrayList<>();
        ArrayList<MenuItem> dessertsList = new ArrayList<>();
    private Date lastUpdated = new Date();

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdated = new Date();
    }

    public Menu(){};

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = new Date();
    }

    public void sortByCourse() {
        for (MenuItem item : menuItems
        ) {
            if (item.getCategory().equals("Appetizer")) {
                appetizersList.add(item);
            } else if (item.getCategory().equals("Main Course")) {
                mainCoursesList.add(item);
            } else if (item.getCategory().equals("Dessert")) {
                dessertsList.add(item);
            }
        }
    }

    public void printMenu() {
        sortByCourse();
        System.out.println("\nNathan's Hole in the Wall\n");
        System.out.println("APPETIZERS:");
        for (MenuItem item: appetizersList){
            System.out.println(item);
        }
        System.out.println("MAIN COURSES:");
        for (MenuItem item: mainCoursesList){
            System.out.println(item);
        }
        System.out.println("DESSERTS:");
        for (MenuItem item: dessertsList){
            System.out.println(item);
        }
        System.out.println("Last updated: " + getLastUpdated());
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        System.out.println(item.getName() + " added to the menu!");
        lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        System.out.println(item.getName() + " removed from the menu.");
        lastUpdated = new Date();
    }
}