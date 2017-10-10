package issue;

public class Item {

    private int sellIn;
    private int quality;

    Item(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void update(){
        updateQuality();
        decrementSellIn();
    }

    public void updateQuality(){
        if(quality > 0){
            if(sellIn <= 0){
                setQuality(getQuality()-2);
            }else{setQuality(getQuality()-1);}
        }
    }

    @Override
    public String toString() {
        return this.sellIn + ", " + this.quality;
    }

    int getSellIn() {
        return sellIn;
    }

    void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    void incrementQuality(int increment) {
        if(getQuality() < 50) {setQuality(getQuality() + increment);}
    }

    void decrementSellIn(){
        setSellIn(getSellIn()-1);
    }
}