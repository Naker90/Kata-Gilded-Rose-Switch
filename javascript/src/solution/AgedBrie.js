const Item = require('./Item');

AgedBrie = function (name, sellIn, quality) {
  this.name = name;
  this.sellIn = sellIn;
  this.quality = quality;
};

AgedBrie.prototype = Object.create(Item.prototype);

AgedBrie.prototype.updateQuality = function() {
    if(this.getSellIn() >= 0){
        if(this.getQuality() < 50) {this.setQuality(this.getQuality() + 1);}
    }else{
        this.updateQuality();
    }
};

module.exports = AgedBrie;  