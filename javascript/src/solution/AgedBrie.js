const Item = require('./Item');

const AgedBrie = function (sellIn, quality) {
  this.sellIn = sellIn;
  this.quality = quality;
};

AgedBrie.prototype = Object.create(Item.prototype);

AgedBrie.prototype.updateQuality = function() {
    if(this.getSellIn() >= 0){
        this.incrementQuality(1);
    }else{
        this.updateQuality();
    }
};

module.exports = AgedBrie;  