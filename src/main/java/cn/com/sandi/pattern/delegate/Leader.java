package cn.com.sandi.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

	private Map<String, IEmployee> register = new HashMap<>();
	
	public Leader() {
		register.put("����", new EmployeeA());
		register.put("�ܹ�", new EmployeeB());
	}
	
	public void doing(String command) {
		register.get(command).doing(command);
	}
}
