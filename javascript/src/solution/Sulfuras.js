const Item = require('./Item');

Sulfuras = function(name, sellIn, quality){
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
};

Sulfuras.prototype = Object.create(Item.prototype);

Sulfuras.prototype.updateQuality = function() {
    if(this.getQuality() != 80){
        this.setQuality(80);
    }
    this.setSellIn(this.getSellIn()-1);

};

module.exports = Sulfuras;