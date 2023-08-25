package org.example;

public class Product {
    private static String name;
    private  static String type;
    private static int sellIn;

    private static int quality;

    public Product(String name, String type, int sellIn, int quality) {
        this.name = name;
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void update(){
        if (!(quality <= 0) &&quality < 50) {
            if (!(name.equals("brie vieillit"))){
                if (!(type.equals("laitier"))) {
                    if (sellIn != 0) {
                        sellIn--;
                        quality--;
                    } else {
                        sellIn--;
                        quality -= 2;
                    }
                } else {
                    sellIn--;
                    quality -= 2;
                }
            }
            if (name.equals("brie vieillit")) {
                sellIn--;
                quality++;
            }
        }
    }



    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
