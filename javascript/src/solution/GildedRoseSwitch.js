GildedRoseSwitch = function(items){

    this.updateQuality =  function() {
        for (let index in items) {
            let item = items[index];

            switch (item.getName()){
                default:
                    item.updateQuality();
                    break;
            }
            item.setSellIn(item.getSellIn()-1);
        }
    };


    function updateItemGenericQuality(item) {
        if(item.getQuality() > 0){
            if(item.getSellIn() <= 0){
                item.setQuality(item.getQuality()-2);
            }else{item.setQuality(item.getQuality()-1);}
        }
    }

};

module.exports = GildedRoseSwitch;