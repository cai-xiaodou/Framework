package cn.com.sandi.pattern.strategy;

public class MsgResult {

	private int code;
	private String msg;
	private Object data;
	
	public MsgResult(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return " [支付状态：" + code + ", 支付结果：" + msg + ", 支付信息：" + data + "]";
	}
	
	
	
}
