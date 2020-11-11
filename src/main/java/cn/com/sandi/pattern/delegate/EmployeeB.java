package cn.com.sandi.pattern.delegate;

public class EmployeeB implements IEmployee {

	@Override
	public void doing(String command) {
		System.out.println("员工B任务："+command);
	}

}
