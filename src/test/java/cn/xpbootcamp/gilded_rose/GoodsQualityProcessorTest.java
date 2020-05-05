package cn.xpbootcamp.gilded_rose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.xpbootcamp.gilded_rose.model.Goods;
import cn.xpbootcamp.gilded_rose.model.GoodsType;
import org.junit.jupiter.api.Test;

class GoodsQualityProcessorTest {

  @Test
  void testCalculate() {
    GoodsQualityProcessor processor = new GoodsQualityProcessor();

    Goods normalGoods = new Goods();
    normalGoods.setGoodsType(GoodsType.NORMAL);
    normalGoods.setSellIn(30);
    normalGoods.setQuality(20);

    int passedDays = 10;
    int actual = processor.calculateQuality(normalGoods, passedDays);
    assertEquals(20, actual);

    normalGoods.setGoodsType(GoodsType.AGED_BRIE);
    actual = processor.calculateQuality(normalGoods, passedDays);
    assertEquals(30, actual);

    normalGoods.setGoodsType(GoodsType.SULFURAS);
    actual = processor.calculateQuality(normalGoods, passedDays);
    assertEquals(20, actual);

    normalGoods.setGoodsType(GoodsType.BACKSTAGE_PASS);
    actual = processor.calculateQuality(normalGoods, passedDays);
    assertEquals(30, actual);
  }
}