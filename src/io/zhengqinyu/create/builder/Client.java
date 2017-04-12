package io.zhengqinyu.create.builder;

import java.util.ArrayList;
import java.util.List;

import io.zhengqinyu.create.builder.abst.PlanBuilder;
import io.zhengqinyu.create.builder.abst.PlanModel;
import io.zhengqinyu.create.builder.impl.HappyPlanBuilder;
import io.zhengqinyu.create.builder.impl.SadPlanBuilder;

/**
 * Created by ZhengQinyu on 2015/11/14.
 */
public class Client {
	public static void main(String[] args) {
		// 首先决定计划的顺序吧
		List<Integer> sequence = new ArrayList<>();
		sequence.add(PlanModel.MOVIE);
		sequence.add(PlanModel.GAME);
		sequence.add(PlanModel.CODE);
		sequence.add(PlanModel.MUSIC);

		// 开始创建计划吧
		PlanBuilder builder;
		PlanModel plan;

		System.out.println("今天心情不错，日子该怎么过呢？");
		// 创建个开心的计划吧
		builder = new HappyPlanBuilder();
		builder.setSequence(sequence);
		// 执行者个开心的计划吧
		plan = builder.getPlanModel();
		plan.run();
		System.out.println("===========================");

		System.out.println("今天不开心了，还是这样过吧：");
		// 创建个伤心日子过的计划吧
		builder = new SadPlanBuilder();
		builder.setSequence(sequence);
		plan = builder.getPlanModel();
		plan.run();

	}
}
