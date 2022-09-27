import java.util.*;


public class CafeUtil {

    public int getStreakGoal(){
        int num = 0;
        for (int i = 0; i <= 10 ; i++ ){
            num += i;
        }
        return num;
    }

    public double getOrderTotal(double[] prices){
        double output = 0;
        for (int i = 0; i < prices.length; i++ ){
            output += prices[i];
        }
        return output;
    }

    public void displayMenu(ArrayList<String> menuItems){
        System.out.println(menuItems);

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        customers.add(userName);
        System.out.println("There are " + customers.size() + "people in front of you");     
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double output = 0;
        for (int i = 1; i <= maxQuantity; i++){
            output = i * price;
            System.out.format(i + " - $%.2f%n", output);
        }


    }

}