package model.unit;

public class Slinger extends LongRangeFighter {

    public static final int size = 1;
    public static final float accuracyNearHit = 0.6f;
    private String imageUrl = "/image/SlingerBB.png";

    public Slinger() {
        hitPoint = 8;
        munition = 5;
        damage = 3;
        armour = 0;
        accuracy = 0.2f;
        nearHit = 2;
        accuracyNear = 0.6f;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
