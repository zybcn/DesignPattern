package cn.zybcn.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-16 22:57
 * @Desc 模拟储蓄卡功能
 */
public class CashCard extends BankCard{

    Logger logger = LoggerFactory.getLogger(CashCard.class);

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }


    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000 成功  00001 失败 00002  重复
     */

    public String withdrawal(String orderId, BigDecimal amount) {
        // 模拟支付成功
        logger.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return "0000";
    }


    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    public String recharge(String orderId, BigDecimal amount) {
        // 模拟充值成功
        logger.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return "0000";
    }

    @Override
    public boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 交易流水查询
     *
     * @return 交易流水
     */
    @Override
    public List<String> tradeFlow() {
        logger.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<String>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return tradeList;
    }

}
