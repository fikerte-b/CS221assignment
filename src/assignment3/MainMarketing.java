package assignment3;

import java.util.ArrayList;

public class MainMarketing {

    public static void main(String[] args) {
        ArrayList<Marketing> marketing = new ArrayList<>();

        Marketing marketing1 = new Marketing("Kelebet","Chair", 150);
        Marketing marketing2 = new Marketing("Yared","Bar Stool", 90);
        Marketing marketing3 = new Marketing("Ruth", "Bed", 600);
        Marketing marketing4 = new Marketing("Joe", "Sofa", 1200);
        Marketing marketing5 = new Marketing("Meklit", "Coffee Table", 200);
        // adding objects to the Marketing
        marketing.add(marketing1);
        marketing.add(marketing2);
        marketing.add(marketing3);
        marketing.add(marketing4);
        marketing.add(marketing5);
        // remove()  delete objects from Marketing
        marketing.remove(marketing4);

        //set()  Modify some objects using set() method
        marketing.set(0, marketing5);

       // To display the contents in the list.
        System.out.println(marketing);

        // Get the size of the list.
        System.out.println("Size: " + marketing.size());

       // Calculate the total sales amount and print the same to the console
       double total = 0;
       for(int i=0; i<marketing.size(); i++){
           total += marketing.get(i).getSalesAmount();
       }
        System.out.println("Total Sales: "+ total);


      // Use get() method
        System.out.println(marketing.get(1));

     // Use clear() method
        marketing.clear();
        System.out.println(marketing);
    }
}
