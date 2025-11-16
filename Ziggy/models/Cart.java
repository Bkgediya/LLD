package models;

import java.util.List;

public class Cart {

    private Restaurant restaurant;
    private List<MenuItem> items;

    public Cart() {
        this.restaurant = null;
    }

    public void addItem(MenuItem item) {
        if (restaurant == null) {
            System.err.println("Cart: Set a restaurant before adding items.");
            return;
        }
        items.add(item);
    }

    public double getTotalCost() {
        double totalPrice = 0.0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void clear() {
        this.restaurant = null;
        this.items.clear();
    }

    public boolean isEmpty() {
        return restaurant == null || items.isEmpty();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
