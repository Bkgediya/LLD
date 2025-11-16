package managers;

import java.util.ArrayList;
import java.util.List;
import models.*;

public class RestaurantManager {

    private static RestaurantManager instance = null;
    private List<Restaurant> restaurants = new ArrayList<>();

    private RestaurantManager() {}

    public static RestaurantManager getInstance() {
        if (instance == null) {
            synchronized (RestaurantManager.class) {
                if (instance == null) {
                    instance = new RestaurantManager();
                }
            }
        }
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public List<Restaurant> searchByLocation(String loc) {
        List<Restaurant> result = new ArrayList<>();
        loc = loc.toLowerCase();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getLocation().toLowerCase().contains(loc)) {
                result.add(restaurant);
            }
        }
        return result;
    }
}
