package cn.xpbootcamp.gilded_rose;

import static cn.xpbootcamp.gilded_rose.model.GoodsType.AGED_BRIE;
import static cn.xpbootcamp.gilded_rose.model.GoodsType.BACKSTAGE_PASS;
import static cn.xpbootcamp.gilded_rose.model.GoodsType.NORMAL;
import static cn.xpbootcamp.gilded_rose.model.GoodsType.SULFURAS;

import cn.xpbootcamp.gilded_rose.algorithm.GoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.algorithm.impl.AgedBrieGoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.algorithm.impl.BackstagePassGoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.algorithm.impl.NormalGoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.algorithm.impl.SulfurasGoodsQualityCalculateAlgorithm;
import cn.xpbootcamp.gilded_rose.model.Goods;
import java.util.HashMap;
import java.util.Map;

public class GoodsQualityProcessor {

  public Map<String, GoodsQualityCalculateAlgorithm> algorithm = new HashMap<>();

  {
    algorithm.put(NORMAL.name(), new NormalGoodsQualityCalculateAlgorithm());
    algorithm.put(AGED_BRIE.name(), new AgedBrieGoodsQualityCalculateAlgorithm());
    algorithm.put(SULFURAS.name(), new SulfurasGoodsQualityCalculateAlgorithm());
    algorithm.put(BACKSTAGE_PASS.name(), new BackstagePassGoodsQualityCalculateAlgorithm());
  }

  public int calculateQuality(Goods goods, int passedDays) {
    return algorithm.get(goods.getGoodsType().name()).calculate(goods, passedDays);
  }
}
