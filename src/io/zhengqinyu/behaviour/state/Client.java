package io.zhengqinyu.behaviour.state;

import io.zhengqinyu.behaviour.state.po.Work;

public class Client {
	public static void main(String[] args) {
		Work emergencyProjects = new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.writePrograme();
		emergencyProjects.setHour(10);
		emergencyProjects.writePrograme();
		emergencyProjects.setHour(12);
		emergencyProjects.writePrograme();
		emergencyProjects.setHour(13);
		emergencyProjects.writePrograme();
		emergencyProjects.setHour(14);
		emergencyProjects.writePrograme();

		emergencyProjects.setHour(17);
//		emergencyProjects.setTaskFinished(true);
		emergencyProjects.setTaskFinished(false);
		emergencyProjects.writePrograme();
		emergencyProjects.setHour(19);
		emergencyProjects.writePrograme();
		emergencyProjects.setHour(22);
		emergencyProjects.writePrograme();

	}
}
