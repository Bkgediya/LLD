import models.*;
import strategies.*;

public class Main {

    public static void main(String[] args) {
        // Simulating a happy flow
        // Create Ziggy Objecct
        Ziggy ziggy = new Ziggy();

        // Simulate a user coming in (Happy Flow)
        User user = new User(101, "Aditya", "Delhi");
        System.out.println("User: " + user.getName() + " is active.");

        // User searches for restaurants by location
        java.util.List<Restaurant> restaurantList = ziggy.searchRestaurants(
            "Delhi"
        );

        if (restaurantList.isEmpty()) {
            System.out.println("No restaurants found!");
            return;
        }

        System.out.println("Found Restaurants:");
        for (Restaurant restaurant : restaurantList) {
            System.out.println(" - " + restaurant.getName());
        }

        // User selects a restaurant
        ziggy.selectRestaurant(user, restaurantList.get(0));
        System.out.println(
            "Selected restaurant: " + restaurantList.get(0).getName()
        );

        // User adds items to the cart
        ziggy.addToCart(user, "P1");
        ziggy.addToCart(user, "P2");

        ziggy.printUserCart(user);

        // User checkout the cart
        Order order = ziggy.checkoutNow(
            user,
            "Delivery",
            new UPIPayment("1234567890")
        );

        // User pays for the cart. If payment is successful, notification is sent.
        ziggy.payForOrder(user, order);
    }
}
