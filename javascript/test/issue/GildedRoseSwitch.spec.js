const expect = require('chai').expect;

const Item = require('../../src/issue/Item');
const GildedRoseSwitch = require('../../src/issue/GildedRoseSwitch');

describe("GildedRoseSwitch Should", () => {

    it("reduce the value of the SellIn", () => {
        const item = new Item("anyItem", 5, 10);

        let items = [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getSellIn()).to.equal(4);
    });

    it("reduce the value of the Quality", () => {
        const item = new Item("anyItem", 5, 10);

        let items = [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getQuality()).to.equal(9);
    });

    it("reduce quality twice as fast when the SellIn is less or equal to 0", () => {
        const item = new Item("anyItem", 0, 10);

        let items= [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getQuality()).to.equal(8);
    });

    it("not leave the quality negative", () => {
        const item = new Item("anyItem", 5, 0);

        let items= [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getQuality()).to.equal(0);
    });

    it("increase the quality of Aged Brie", () => {
        const item = new Item("Aged Brie", 5, 10);

        let items= [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getQuality()).to.equal(11);
    });

    it("not increase the quality more than 50", () => {
        const item = new Item("Aged Brie", 5, 50);

        let items= [item];
        new GildedRoseSwitch(items).updateQuality();

        expect(item.getQuality()).to.equal(50);
    })

});