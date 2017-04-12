package io.zhengqinyu.create.builder.impl;


import java.util.List;

import io.zhengqinyu.create.builder.abst.PlanBuilder;
import io.zhengqinyu.create.builder.abst.PlanModel;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */
public class HappyPlanBuilder extends PlanBuilder {

    PlanModel happyPlan = new HappyPlan();

    @Override
    public void setSequence(List<Integer> sequence) {
        happyPlan.setSequence(sequence);
    }

    @Override
    public PlanModel getPlanModel() {
        return this.happyPlan;
    }
}
