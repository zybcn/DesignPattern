package cn.zybcn.design.impl;


import cn.zybcn.design.IVideoUserService;


/**
 * @author zhangyibo
 */
public class OrdinaryVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("普通用户，视频720P超清");
    }

    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
