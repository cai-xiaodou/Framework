package cn.com.sandi.pattern.delegate;

public class EmployeeA implements IEmployee {

	@Override
	public void doing(String command) {
		System.out.println("员工A任务："+command);
	}

}
