package cn.xpbootcamp.gilded_rose.algorithm.impl;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;

public class SulfurasGoodsQualityCalculateAlgorithm implements GoodsQualityCalculateAlgorithm {

  @Override
  public int calculate(Goods goods, int passedDays) {
    return goods.getQuality();
  }
}