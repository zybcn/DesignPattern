package cn.zybcn.design.impl;


import cn.zybcn.design.IVideoUserService;

/**
 * @author zhangyibo
 */
public class VipVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
