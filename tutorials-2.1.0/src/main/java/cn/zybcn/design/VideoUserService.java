package cn.zybcn.design;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-14 21:35
 */
public class VideoUserService {

    public void serveGrade(String userType) {
        if ("VIP用户".equals(userType)) {
            System.out.println("VIP用户，视频1080P蓝光");
        } else if ("普通用户".equals(userType)) {
            System.out.println("普通用户，视频720P超清");
        } else if ("访客用户".equals(userType)) {
            System.out.println("访客用户，视频480P高清");
        }
    }
}
