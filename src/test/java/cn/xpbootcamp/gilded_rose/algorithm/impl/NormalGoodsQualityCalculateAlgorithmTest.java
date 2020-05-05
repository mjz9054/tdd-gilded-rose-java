package cn.xpbootcamp.gilded_rose.algorithm.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;
import cn.xpbootcamp.gilded_rose.model.GoodsType;
import org.junit.jupiter.api.Test;

class NormalGoodsQualityCalculateAlgorithmTest {

  @Test
  void testCalculate() {
    Goods normalGoods = new Goods();
    normalGoods.setGoodsType(GoodsType.NORMAL);
    normalGoods.setSellIn(30);
    normalGoods.setQuality(100);

    GoodsQualityCalculateAlgorithm algorithm = new NormalGoodsQualityCalculateAlgorithm();

    int passedDays = 10;
    int actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(100, actual);

    passedDays = 30;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(100, actual);

    passedDays = 31;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(98, actual);

    passedDays = 40;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(80, actual);

    passedDays = 80;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(0, actual);

    passedDays = 81;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(0, actual);
  }
}