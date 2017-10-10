GildedRoseSwitch = function(items){
    this.updateQuality =  function() {
        for (let index in items) {
            items[index].update();
        }
    };
};

module.exports = GildedRoseSwitch;