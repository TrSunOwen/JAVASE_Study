package practice;

/**
 * 大类
 * @author Owen
 *
 */

public class User {
	
	private String name;
	private int accountBalance;
	
	public User() {
		super();
	}
	
	public User(String name, int accountBalance) {
		super();
		this.name = name;
		this.accountBalance = accountBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void show() {
		System.out.println("我叫：" + name + "，我有多少钱：" + accountBalance);
	}
	
}
