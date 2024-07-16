package org.betania.curs11;

import static org.betania.curs11.RestaurantType.MEDITERANEEAN;

record Restaurant(
        String name,
        String city,
        double rating,
        RestaurantType type
) {
    public Restaurant {
        if (isEmptyOrNull(name)) {
            name = "unknown";
        }
        if (isEmptyOrNull(city)) {
            city = "unknown";
        }
        if (rating < 0 || rating > 5) {
            rating = 2.5;
        }
        if (type == null) {
            type = MEDITERANEEAN;
        }
    }

    private boolean isEmptyOrNull(String name) {
        return name == null || name.isBlank();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("mc", "oradea", 2.5, null);
        System.out.println(restaurant);
    }
}
