package io.zhengqinyu.create.builder.impl;


import java.util.List;

import io.zhengqinyu.create.builder.abst.PlanBuilder;
import io.zhengqinyu.create.builder.abst.PlanModel;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */
public class SadPlanBuilder extends PlanBuilder {

    PlanModel sayPlan = new SadPlan();

    @Override
    public void setSequence(List<Integer> sequence) {
        this.sayPlan.setSequence(sequence);
    }

    @Override
    public PlanModel getPlanModel() {
        return this.sayPlan;
    }
}
