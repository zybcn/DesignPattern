package cn.zybcn.design.test;

import cn.zybcn.design.ICalculationArea;
import cn.zybcn.design.impl.CalculationAreaExt;
import org.junit.Test;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-14 21:51
 */
public class ApiTest {


    @Test
    public  void test() {
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(4);
        System.out.println(circular);;
    }

}
