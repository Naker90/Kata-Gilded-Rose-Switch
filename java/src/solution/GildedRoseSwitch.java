package issue;

class GildedRoseSwitch {
    private Item[] items;

    GildedRoseSwitch(Item[] items) {this.items = items;}

    void update() { for (Item item : items) { item.update(); } }
}
