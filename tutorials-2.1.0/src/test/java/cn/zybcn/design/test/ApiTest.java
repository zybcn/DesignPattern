package cn.zybcn.design.test;

import cn.zybcn.design.VideoUserService;
import org.junit.Test;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-14 21:51
 */
public class ApiTest {


    @Test
    public  void test() {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }

}
