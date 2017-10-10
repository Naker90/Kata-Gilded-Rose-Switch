package issue;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GildedRoseShould {

    @Test
    public void given_decrement_sellIn() throws Exception {
        Item thing = new Item(20, 20);

        updateOneItem(thing);

        assertThat(thing.getSellIn(), is(19));
    }

    @Test
    public void given_decrement_quality() throws Exception {
        Item thing = new Item(20, 11);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(10));
    }

    @Test
    public void given_decrement_when_sellIn_expires_twice_fast_quality() throws Exception {
        Item thing = new Item(0, 10);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(8));
    }

    @Test
    public void quality_is_never_negative() throws Exception {
        Item thing = new Item(20, 0);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(0));
    }

    @Test
    public void aged_brie_when_is_older_increments_quality() throws Exception {
        Item thing = new AgedBrie(20, 0);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(1));
    }

    @Test
    public void given_aged_brie_quality_is_never_more_than_50() throws Exception {
        Item thing = new AgedBrie(20, 50);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(50));
    }

    @Test
    public void given_backstage_quality_is_never_more_than_50() throws Exception {
        Item thing = new Backstage(9, 50);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(50));
    }


    @Test
    public void sulfuras_never_decrements_quality() throws Exception {
        Item thing = new Sulfuras(20, 33);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(80));
    }

    @Test
    public void given_backstage_quality_increments_2_when_10_sellIn_or_less() throws Exception {
        Item thing = new Backstage(9, 33);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(35));
    }

    @Test
    public void given_backstage_quality_increments_3_when_5_sellIn_or_less() throws Exception {
        Item thing = new Backstage(4, 33);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(36));
    }

    @Test
    public void given_backstage_quality_drops_to0_when_0_sellIn_or_less() throws Exception {
        Item thing = new Backstage(0, 100);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(0));
    }

    @Test
    public void given_conjured_quality_decrement_double_fast() throws Exception {
        Item thing = new Conjured(4, 100);

        updateOneItem(thing);

        assertThat(thing.getQuality(), is(98));
    }

    private void updateOneItem(Item thing) {
        Item[] items = {thing};
        new GildedRoseSwitch(items).update();
    }

}
