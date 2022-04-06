package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
   
   protected void increaseQuality() {
	   if (quality < 50) {
		   quality = quality + 1;
		   }
  }
  
   protected void decreaseQuality() {
	   if (quality > 0) {
	  		quality = quality - 1;
	      }
  }
   
   
   protected void updateAgedBrieItem() {
	   	this.sellIn = this.sellIn - 1;
	   	increaseQuality();
	   	if (this.sellIn < 0) {
	   		increaseQuality();
	   	}
   }
   
   protected void updateBackstageItem() {
		this.sellIn = this.sellIn - 1;
	   	increaseQuality();
	    if (this.sellIn < 10) {
	   	 increaseQuality();
	    }
	
	    if (this.sellIn < 5) {
	   	 increaseQuality();
	    }
	    if (this.sellIn < 0) {
	  	 this.quality = 0;
	   	}
   }
   
   protected void updateItem(){
		this.sellIn = this.sellIn - 1;
	   	decreaseQuality();
		if (this.sellIn < 0) {
			decreaseQuality();
	   	}
   }
   
   protected void updateConjuredItem() {
	   this.sellIn = this.sellIn - 1;
	   for (int speedCount = 0; speedCount < 2; speedCount++ ) {
			decreaseQuality();
			if (this.sellIn < 0) {
				decreaseQuality();
		   	}
	   }
	   
   }
}
