package cn.zybcn.design;

import java.util.List;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-21 23:00
 */
public class DrawControl {



    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }
}
