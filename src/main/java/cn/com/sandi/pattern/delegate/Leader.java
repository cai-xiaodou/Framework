package cn.com.sandi.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

	private Map<String, IEmployee> register = new HashMap<>();
	
	public Leader() {
		register.put("¼ÓÃÜ", new EmployeeA());
		register.put("¼Ü¹¹", new EmployeeB());
	}
	
	public void doing(String command) {
		register.get(command).doing(command);
	}
}
