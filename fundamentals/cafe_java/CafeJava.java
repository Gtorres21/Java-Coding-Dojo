public class CafeJava {
    public static void main(String[] args){
        //APP VARIABLES
        // Lines of text that will appear in the app. 
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu Variable (Add yours below)
        double mochaPrice = 3.5;
        double coffeePrice = 2.0;
        double lattePrice = 2.5;
        double cappuccinoPrice = 3.5;


        // Customer Name variable (Add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (ADD your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); //DISPLAYS "Welcome to Cafe Java, Cindhuri"
        // ** Your Customer interaction print statements will go here **//
        System.out.println(generalGreeting + pendingMessage + customer1);

        if(isReadyOrder4){
            System.out.println(generalGreeting + pendingMessage);
        } else{
            System.out.println(customer4 + displayTotalMessage + cappuccinoPrice);
        }

        if(isReadyOrder2){
            isReadyOrder2 = true;
        System.out.println(customer2 + "  " + (lattePrice*2));
        }else{
            System.out.println(pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (coffeePrice-lattePrice));

    }
}