import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){

// Item Instances

        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 2.10;


        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 2.50;

        Item item3 = new Item();
        item3.name = "Drip coffee";
        item3.price = 1.00;

        Item item4 = new Item();
        item4.name = "Capuccino";
        item4.price = 3.00;

        // System.out.printf("Name; %s \n", item1.name);


// Order Instances

        Order order1 = new Order();
        order1.name = "Cindhuri";
        // The outcome is a Memory Location
        System.out.println(order1);
        System.out.printf("Name: %s \n", order1.name);
        order1.ready = true;
        System.out.print(order1.name + "Order is Ready " + order1.ready);
        


        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println(order2.total);
        order2.ready = true;
        System.out.print(order2.name + "Order is Ready " + order2.ready);


        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Order 3 your %s will be %f", item4.name, order3.total);


        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.items.add(item2);






        

    }
}