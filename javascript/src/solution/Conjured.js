const Item = require('./Item');

const Conjured = function(sellIn, quality) {
    this.sellIn = sellIn;
    this.quality = quality;
};

Conjured.prototype = Object.create(Item.prototype);

Conjured.prototype.updateQuality = function() {
  Item.prototype.updateQuality.call(this);
  Item.prototype.updateQuality.call(this);
};

module.exports = Conjured;
