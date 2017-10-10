const Item = require('./Item');

Backstage = function(name, sellIn, quality) {
  this.name = name;
  this.sellIn = sellIn;
  this.quality = quality;
};

Backstage.prototype = Object.create(Item.prototype);

Backstage.prototype.updateQuality = function() {
    this.setSellIn(this.getSellIn()-1);

    if(this.getSellIn() <= 0){
        this.setQuality(0);
    }else {
        if (this.getSellIn() <= 5) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 3);
            }
        } else if (this.getSellIn() <= 10) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 2);
            }
        }
    }  
};

module.exports = Backstage;