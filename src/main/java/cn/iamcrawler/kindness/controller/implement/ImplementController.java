package cn.iamcrawler.kindness.controller.implement;

import cn.iamcrawler.crawler_common.domain.kindness.PgOrder;
import cn.iamcrawler.crawler_common.feign.KindnessFeign;
import cn.iamcrawler.kindness.service.PgOrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuliang on 2019/4/19.
 */
public class ImplementController implements KindnessFeign {

    @Autowired
    private PgOrderService pgOrderService;

    @Override
    public Boolean insertOne(PgOrder pgOrder) {
        boolean save = pgOrderService.save(pgOrder);
        return save;
    }
}
