package io.zhengqinyu.create.builder.abst;

import java.util.List;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */
public abstract class PlanBuilder {

    public abstract void setSequence(List<Integer> sequence);

    public abstract PlanModel getPlanModel();
}
