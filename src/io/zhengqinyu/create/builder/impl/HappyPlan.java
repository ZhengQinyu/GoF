package io.zhengqinyu.create.builder.impl;

import io.zhengqinyu.create.builder.abst.PlanModel;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */
public class HappyPlan extends PlanModel {
    @Override
    protected void seeMovie() {
        System.out.println("看场喜剧");
    }

    @Override
    protected void listenMusic() {
        System.out.println("听听快乐的歌曲");
    }

    @Override
    protected void playGame() {
        System.out.println("开心的打机吧");
    }

    @Override
    protected void coding() {
        System.out.println("欢快的打代码");
    }
}
