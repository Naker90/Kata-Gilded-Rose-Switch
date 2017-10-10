package issue;

public class Conjured extends Item {

    public Conjured( int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }
}
