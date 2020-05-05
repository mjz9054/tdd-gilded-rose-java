package cn.xpbootcamp.gilded_rose.algorithm.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;
import cn.xpbootcamp.gilded_rose.model.GoodsType;
import org.junit.jupiter.api.Test;

class SulfurasGoodsQualityCalculateAlgorithmTest {

  @Test
  void testCalculate() {
    Goods normalGoods = new Goods();
    normalGoods.setGoodsType(GoodsType.SULFURAS);
    normalGoods.setSellIn(30);
    normalGoods.setQuality(20);

    GoodsQualityCalculateAlgorithm algorithm = new SulfurasGoodsQualityCalculateAlgorithm();

    int passedDays = 10;
    int actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(20, actual);

    passedDays = 30;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(20, actual);

    passedDays = 31;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(20, actual);

    passedDays = 40;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(20, actual);
  }
}