package org.betania.curs11;

public enum RestaurantType {
    MEDITERANEEAN(4),
    GREEK(3),
    ROMANIAN(5),
    FUSION(2);

    private final int stars;

    RestaurantType(int stars) {
        this.stars = stars;
    }

    public String subType() {
        return this.name().toLowerCase();
    }

    public int getStars() {
        return stars;
    }
}
