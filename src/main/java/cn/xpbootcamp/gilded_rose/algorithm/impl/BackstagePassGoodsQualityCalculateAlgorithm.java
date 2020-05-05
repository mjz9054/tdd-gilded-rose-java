package cn.xpbootcamp.gilded_rose.algorithm.impl;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;

public class BackstagePassGoodsQualityCalculateAlgorithm implements GoodsQualityCalculateAlgorithm {

  @Override
  public int calculate(Goods goods, int passedDays) {
    int quality = goods.getQuality();
    int sellIn = goods.getSellIn();
    int leftDays = sellIn - passedDays;
    if (passedDays <= sellIn) {
      if (leftDays > 10) {
        quality += passedDays;
      } else if (leftDays >= 5) {
        quality += passedDays + (10 - leftDays);
      } else {
        quality += passedDays + 5 + (5 - leftDays) * 2;
      }
    } else {
      quality = 0;
    }
    return Math.min(quality, MAX_QUALITY);
  }
}