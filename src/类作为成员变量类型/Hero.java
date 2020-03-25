package 类作为成员变量类型;

//游戏中的英雄角色类
public class Hero {
	
	//String就是一个类
	private String name; //英雄名字
	private int age;
	private Weapon weapon; //武器
	
	public Hero() {
		
	}

	public Hero(String name, int age, Weapon weapon) {
		this.name = name;
		this.age = age;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		System.out.println("年龄为" + age + "的" + name + "正在用" + weapon.getCode() + "平A了一次！");
	}
	
}
