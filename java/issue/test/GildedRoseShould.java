import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GildedRoseShould {

    @Test
    public void item_decrement_quality() throws Exception {
        Item anyItem = new Item("anyItem", 20, 2);
        Item [] items = {anyItem};

        GildedRoseSwitch gildedRose = new GildedRoseSwitch(items);
        gildedRose.updateQuality();

        assertThat(anyItem.quality, is(1));
    }

    @Test
    public void item_decrement_sellIn() throws Exception {
        Item anyItem = new Item("anyItem", 2, 20);
        Item [] items = {anyItem};

        GildedRoseSwitch gildedRose = new GildedRoseSwitch(items);
        gildedRose.updateQuality();

        assertThat(anyItem.sellIn, is(1));
    }

    @Test
    public void quality_item_never_is_negative() throws Exception {
        Item anyItem = new Item("anyItem", 0, 0);
        Item [] items = {anyItem};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(anyItem.quality, is(0));
    }

    @Test
    public void once_sell_date_has_passes_quality_degrade_twice_fast() throws Exception {
        Item anyItem = new Item("anyItem", 0, 4);
        Item [] items = {anyItem};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(anyItem.quality, is(2));
    }

    @Test
    public void AgedBrie_increment_quality_as_time_passes() throws Exception {
        Item agedBrie = new Item("Aged Brie", 20, 4);
        Item [] items = {agedBrie};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(agedBrie.quality, is(5));
    }

    @Test
    public void quality_item_never_more_than_50() throws Exception {
        Item agedBrie = new Item("Aged Brie", 20, 50);
        Item [] items = {agedBrie};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(agedBrie.quality, is(50));
    }

    @Test
    public void sulfuras_never_decrement_quality() throws Exception {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 20, 1);
        Item [] items = {sulfuras};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(sulfuras.quality, is(1));
    }

    @Test
    public void backstage_passes_quality_icreases_by_2_there_are_10_days_or_less() throws Exception {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 4);
        Item [] items = {backstage};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(backstage.quality, is(6));
    }

    @Test
    public void backstage_passes_quality_icreases_by_3_there_are_5_days_or_less() throws Exception {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 4);
        Item [] items = {backstage};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(backstage.quality, is(7));
    }

    @Test
    public void backstage_passes_quality_0_when_sellIn_0() throws Exception {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50);
        Item [] items = {backstage};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertThat(backstage.quality, is(0));
    }
}
