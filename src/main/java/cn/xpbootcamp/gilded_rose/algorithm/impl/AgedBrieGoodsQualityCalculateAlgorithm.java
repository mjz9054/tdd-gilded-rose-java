package cn.xpbootcamp.gilded_rose.algorithm.impl;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;

public class AgedBrieGoodsQualityCalculateAlgorithm implements GoodsQualityCalculateAlgorithm {

  @Override
  public int calculate(Goods goods, int passedDays) {
    int quality = goods.getQuality();
    quality += passedDays;
    return Math.min(quality, MAX_QUALITY);
  }
}