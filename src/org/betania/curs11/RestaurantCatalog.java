package org.betania.curs11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantCatalog {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantCatalog(List<Restaurant> restaurants) {
        this.restaurants.addAll(restaurants);
    }

    public List<Restaurant> getRestaurantsInACity(String city) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.city().equals(city)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public Map<String, String> mapNameToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.name(), restaurant.city());
        }
        return result;
    }
}
