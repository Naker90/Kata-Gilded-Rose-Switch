const Item = require('./Item');

Sulfuras = function(sellIn, quality){
    this.sellIn = sellIn;
    this.quality = quality;
};

Sulfuras.prototype = Object.create(Item.prototype);

Sulfuras.prototype.updateQuality = function() {
    if(this.getQuality() != 80){
        this.setQuality(80);
    }
};

module.exports = Sulfuras;