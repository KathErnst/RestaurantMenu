package restaurant;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Toasted Ravioli", 4.00, "A St. Louis favorite!", "Appetizer", new Date());
        MenuItem item2 = new MenuItem("Chicken Fingers", 7.00, "Standard, served with fries", "Main Course", new Date());
        MenuItem item3 = new MenuItem("Pad Thai", 9.00, "Options of chicken or tofu", "Main Course", new Date());
        MenuItem item4 = new MenuItem("Fried Bananas", 3.00, "Served with vanilla ice cream", "Dessert", new Date());
        MenuItem item5 = new MenuItem("Hash Browns", 3.00, "Breakfast for dinner?", "Appetizer", new Date());
        MenuItem item6 = new MenuItem("Fried Brussels Sprouts", 7.00, "Served with house-made hummus", "Appetizer", new Date());
        MenuItem item7 = new MenuItem("Jambalaya", 10.00, "Shrimp, hot sausage, crab, and red beans", "Main Course", new Date());
        MenuItem item8 = new MenuItem("Chocolate Lava Crunch Cakes", 4.00, "Gooey chocolate center", "Dessert", new Date());

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);
        menu.addItem(item7);
        menu.addItem(item8);
        menu.removeItem(item5);


        menu.printMenu();
    }
}
