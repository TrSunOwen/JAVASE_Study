package 类作为成员变量类型;

public class DemoMain {

	public static void main(String[] args) {
		// 创建一个英雄角色
		Hero hero = new Hero();
		// 为英雄起一个名字，设置年龄
		hero.setName("小炮");
		hero.setAge(10);
		
		// 创建一个武器对象
		Weapon weapon = new Weapon("多兰剑");
		// 为英雄配备武器
		hero.setWeapon(weapon);
		
		// 年龄为10的小炮正在用多兰剑平A了一次！
		hero.attack();
	}
	
}
