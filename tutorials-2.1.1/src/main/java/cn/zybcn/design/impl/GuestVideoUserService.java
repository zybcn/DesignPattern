package cn.zybcn.design.impl;


import cn.zybcn.design.IVideoUserService;

/**
 * @author zhangyibo
 */
public class GuestVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }

}
