package io.zhengqinyu.create.builder.abst;

import java.util.List;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */


public abstract class PlanModel {

    public final static int MOVIE = 0;

    public final static int MUSIC = 1;

    public final static int GAME = 2;

    public final static int CODE = 3;

    private List<Integer> sequence;

    protected abstract void seeMovie();

    protected abstract void listenMusic();

    protected abstract void playGame();

    protected abstract void coding();

    //开始运行，final限制方法被重写
    public final void run(){
        for(Integer type : sequence)
            switch (type) {
                case MOVIE:
                    seeMovie();
                    break;
                case MUSIC:
                    listenMusic();
                    break;
                case GAME:
                    playGame();
                    break;
                case CODE:
                    coding();
                    break;
                default:
                    throw new IllegalArgumentException("参数错误");
            }
    }

    public final void setSequence(List<Integer> sequence){
        this.sequence = sequence;
    }

}
