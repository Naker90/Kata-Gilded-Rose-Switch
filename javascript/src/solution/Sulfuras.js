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
};

module.exports = Sulfuras;