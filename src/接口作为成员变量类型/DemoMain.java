package 接口作为成员变量类型;

public class DemoMain {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setName("盖伦"); // 设置英雄名称
		
		//设置英雄的技能
//		hero.setSkill(new skillImpl()); // 使用单独定义的实现类
		
//		//还可以改成匿名使用内部类
//		Skill skill = new Skill() {
//			@Override
//			public void use() {
//				System.out.println("大宝剑");
//			}
//		};
//		hero.setSkill(skill);
		
		//进一步简化，同时使用匿名内部类和匿名对象
		hero.setSkill(new Skill() {
			@Override
			public void use() {
				System.out.println("大宝剑");
			}
		});
		
		hero.attack();
	}
	
}
