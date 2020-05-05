package cn.xpbootcamp.gilded_rose.algorithm;

import cn.xpbootcamp.gilded_rose.model.Goods;

public interface GoodsQualityCalculateAlgorithm {

  int MIN_QUALITY = 0;
  int MAX_QUALITY = 50;

  int calculate(Goods goods, int passedDays);
}
