package cn.xpbootcamp.gilded_rose.algorithm.impl;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;

public class NormalGoodsQualityCalculateAlgorithm implements GoodsQualityCalculateAlgorithm {

  @Override
  public int calculate(Goods goods, int passedDays) {
    int quality = goods.getQuality();
    int sellIn = goods.getSellIn();
    if (sellIn < passedDays) {
      quality -= (passedDays - sellIn) * 2;
    }
    return Math.max(quality, MIN_QUALITY);
  }
}
