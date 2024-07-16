package org.betania.curs11;

import java.util.List;

import static org.betania.curs11.RestaurantType.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(MEDITERANEEAN.subType());
        System.out.println(ROMANIAN.getStars());
        RestaurantCatalog catalog = new RestaurantCatalog(
                List.of(
                        new Restaurant("Spoon", "Oradea", 4, MEDITERANEEAN),
                        new Restaurant("Dock", "Oradea", 4, ROMANIAN),
                        new Restaurant("Varzarie", "Cluj", 4, ROMANIAN),
                        new Restaurant("Steakhouse", "Timisoara", 4, FUSION),
                        new Restaurant("Tzatziki", "Cluj", 4, GREEK),
                        new Restaurant("Mediterana", "Oradea", 4, MEDITERANEEAN)
                ));

        System.out.println(catalog.mapNameToCity());
    }
}
