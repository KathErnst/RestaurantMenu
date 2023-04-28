package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

  private String name;
  private Double price;
  private String description;
  private String category;
  Date dateAdded = new Date();

  public MenuItem(String name, Double price, String description, String category, Date dateAdded) {
     this.name = name;
     this.price = price;
     this.description = description;
     this.category = category;
     this.dateAdded = dateAdded;
  }

   public String getName() {
      return name;
   }

   public Double getPrice() {
      return price;
   }

   public String getDescription() {
      return description;
   }

   public String getCategory() {
      return category;
   }

   public Date getDateAdded() {
      return dateAdded;
   }

   public boolean isNew() {
     Date d1 = new Date(2023, 3, 1);
     if (dateAdded.after(d1)) {
      return true;
     } else {
        return false;
      }
   }
// TODO: Fix isNew() method (it's not actually working right now)
   @Override
   public String toString() {
     if (isNew()) {
        return "\n" + name + "-- NEW!" + "\n" + description
                + "\n" + "| $" + price + " |\n";
     } else {
        return "\n" + name + "\n" + description
                + "\n" + "| $" + price + "|\n";
     }
   }
}