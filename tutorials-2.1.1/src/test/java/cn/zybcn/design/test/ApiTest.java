package cn.zybcn.design.test;

import cn.zybcn.design.IVideoUserService;
import cn.zybcn.design.impl.OrdinaryVideoUserService;
import org.junit.Test;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-14 21:51
 */
public class ApiTest {


    @Test
    public  void test() {
        IVideoUserService guest = new OrdinaryVideoUserService();
        guest.advertisement();
        guest.definition();
    }

}
