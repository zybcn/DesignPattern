package cn.zybcn.design.test;

import cn.zybcn.design.CashCard;
import cn.zybcn.design.CreditCard;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-14 21:51
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CashCard() {
        CashCard cashCard = new CashCard();
        // 提现
        cashCard.withdrawal("100001", new BigDecimal(100));
        // 储蓄
        cashCard.recharge("100001", new BigDecimal(100));
        // 交易流水
        List<String> tradeFlow = cashCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }

    @Test
    public void test_CreditCard() {
        CreditCard creditCard = new CreditCard();
        // 支付
        creditCard.withdrawal("100001", new BigDecimal(100));
        // 还款
        creditCard.recharge("100001", new BigDecimal(100));
        // 交易流水
        List<String> tradeFlow = creditCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }

}
