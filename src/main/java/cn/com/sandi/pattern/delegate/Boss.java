package cn.com.sandi.pattern.delegate;

public class Boss {

	public void command(String command,Leader leader) {
		leader.doing(command);
	}
	
	public static void main(String[] args) {
		new Boss().command("¼Ü¹¹", new Leader());
	}
}
