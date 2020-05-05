package cn.xpbootcamp.gilded_rose.algorithm.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;
import cn.xpbootcamp.gilded_rose.model.GoodsType;
import org.junit.jupiter.api.Test;

class BackstagePassGoodsQualityCalculateAlgorithmTest {

  @Test
  void testCalculate() {
    Goods normalGoods = new Goods();
    normalGoods.setGoodsType(GoodsType.BACKSTAGE_PASS);
    normalGoods.setSellIn(30);
    normalGoods.setQuality(10);

    GoodsQualityCalculateAlgorithm algorithm = new BackstagePassGoodsQualityCalculateAlgorithm();

    int passedDays = 10;
    int actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(20, actual);

    passedDays = 20;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(30, actual);

    passedDays = 22;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(34, actual);

    passedDays = 25;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(40, actual);

    passedDays = 27;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(46, actual);

    passedDays = 30;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(50, actual);

    passedDays = 31;
    actual = algorithm.calculate(normalGoods, passedDays);
    assertEquals(0, actual);
  }
}