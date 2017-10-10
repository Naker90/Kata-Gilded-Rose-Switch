package issue;

public class AgedBrie extends Item{

    AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(getSellIn() >= 0){
            super.incrementQuality(1);
        }else{
            super.updateQuality();
        }
    }
}
