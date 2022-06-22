package cn.zybcn.design;

import java.util.List;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-21 22:57
 */
public interface IDraw {
    List<BetUser> prize(List<BetUser> list, int count);
}
