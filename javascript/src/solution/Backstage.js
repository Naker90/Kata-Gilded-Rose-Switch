const Item = require('./Item');

const Backstage = function(sellIn, quality) {
  this.sellIn = sellIn;
  this.quality = quality;
};

Backstage.prototype = Object.create(Item.prototype);

Backstage.prototype.updateQuality = function() {
    if(this.getSellIn() <= 0){
        this.setQuality(0);
    }else {
        if (this.getSellIn() <= 5) {
            this.incrementQuality(3);
        } else if (this.getSellIn() <= 10) {
            this.incrementQuality(2);
        }
    }  
};

module.exports = Backstage;