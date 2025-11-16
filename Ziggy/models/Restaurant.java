package models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private static int nextRestaurantId = 0;
    private int restaurantId;
    private String name;
    private List<MenuItem> menus = new ArrayList<>();
    private String location;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.restaurantId = ++nextRestaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<MenuItem> getMenu() {
        return menus;
    }

    public void setMenus(List<MenuItem> menus) {
        this.menus = menus;
    }

    public void addMenuItem(MenuItem menu) {
        this.menus.add(menu);
    }
}
