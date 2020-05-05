package cn.xpbootcamp.gilded_rose.model;

public class Goods {

  private int sellIn;

  private int quality;

  private GoodsType goodsType;

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

  public GoodsType getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(GoodsType goodsType) {
    this.goodsType = goodsType;
  }
}
