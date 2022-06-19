package cn.zybcn.design.test;

import cn.zybcn.design.CashCard;
import cn.zybcn.design.CreditCard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-14 21:51
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);


    @Test
    public void test_bankCard() {
        logger.info("里氏替换前，CashCard类：");
        CashCard bankCard = new CashCard("6214567800989876", "2022-03-05");
        // 提现
        bankCard.withdrawal("100001", new BigDecimal(100));
        // 储蓄
        bankCard.recharge("100001", new BigDecimal(100));

        logger.info("里氏替换后，CreditCard类：");
        CashCard creditCard = new CreditCard("6214567800989876", "2022-03-05");
        // 提现
        creditCard.withdrawal("100001", new BigDecimal(1000000));
        // 储蓄
        creditCard.recharge("100001", new BigDecimal(100));
    }

    @Test
    public void test_CreditCard() {
        CreditCard creditCard = new CreditCard("6214567800989876", "2022-03-05");
        // 支付，贷款
        creditCard.loan("100001", new BigDecimal(100));
        // 还款
        creditCard.repayment("100001", new BigDecimal(100));
    }


}
