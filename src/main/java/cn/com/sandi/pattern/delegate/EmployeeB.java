package cn.com.sandi.pattern.delegate;

public class EmployeeB implements IEmployee {

	@Override
	public void doing(String command) {
		System.out.println("Ա��B����"+command);
	}

}
