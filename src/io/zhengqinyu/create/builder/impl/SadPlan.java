package io.zhengqinyu.create.builder.impl;

import io.zhengqinyu.create.builder.abst.PlanModel;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */

public class SadPlan extends PlanModel {
    @Override
    protected void seeMovie() {
        System.out.println("看场悲剧");
    }

    @Override
    protected void listenMusic() {
        System.out.println("听听伤心的歌曲");
    }

    @Override
    protected void playGame() {
        System.out.println("打游戏发泄下吧");
    }

    @Override
    protected void coding() {
        System.out.println("哪有心情打代码");
    }
}
