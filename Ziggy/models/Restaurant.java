package models;

import java.util.List;
import java.util.ArrayList;

class Restaurant {

    private static int nextRestaurantId = 0;
    private int restaurantId;
    private String name;
    private List<MenuItem> menus;
    private String location;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.restaurantId = ++nextRestaurantId;
    }

    public String getName() {
        return name
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

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void addMenu(MenuItem menu) {
        menus.add(menu);
    }
}
