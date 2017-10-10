Item = function(name, sellIn,quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
};

Item.prototype.update = function() {
  this.updateQuality();
  this.decrementSellIn();
};

Item.prototype.updateQuality = function() {
    if(this.getQuality() > 0){
        if(this.getSellIn() <= 0){
            this.setQuality(this.getQuality()-2);
        }else{this.setQuality(this.getQuality()-1);}
    }
};

Item.prototype.incrementQuality = function(value) {
    if(this.getQuality() < 50) {this.setQuality(this.getQuality() + value);}
};

Item.prototype.decrementSellIn = function() {
    this.setSellIn(this.getSellIn()-1);
};

Item.prototype.print =  function(){
    return this.name + ", " + this.sellIn + ", " + this.quality;
};

Item.prototype.getName = function(){
    return this.name;
};

Item.prototype.getSellIn = function(){
    return this.sellIn;
};

Item.prototype.setSellIn = function(newSellIn){
    this.sellIn = newSellIn;
};

Item.prototype.getQuality = function(){
    return this.quality;
};

Item.prototype.setQuality = function(newQuality){
    this.quality = newQuality;
};

module.exports = Item;