const expect = require('chai').expect;

const Item = require('../../src/issue/Item');
const GildedRoseSwitch = require('../../src/issue/GildedRoseSwitch');

describe("GildedRoseSwitch Should", () => {

    let sellIn, quality;

    beforeEach("initialize the values of SellIn and Quality ​​for each test", () => {
        sellIn = 5;
        quality = 10;
    });

    it("reduce the value of the SellIn", () => {
        const item = new Item("anyItem", sellIn, quality);

        let items = [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getSellIn()).to.equal(sellIn - 1);
    });
});