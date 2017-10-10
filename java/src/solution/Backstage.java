package issue;

public class Backstage extends Item {

    Backstage( int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() <= 0) {
            setQuality(0);
        } else if (getSellIn() <= 5) {
            incrementQuality(3);
        } else if (getSellIn() <= 10) {
            incrementQuality(2);
        }
    }
}
