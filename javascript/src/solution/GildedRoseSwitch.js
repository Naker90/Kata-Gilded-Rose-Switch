GildedRoseSwitch = function(items){
    this.updateQuality =  function() {
        for (let index in items) {
            items[index].updateQuality();
            items[index].setSellIn(items[index].getSellIn()-1);
        }
    };
};

module.exports = GildedRoseSwitch;