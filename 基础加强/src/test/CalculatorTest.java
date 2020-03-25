package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junit.Calculator;

public class CalculatorTest {
	
	/*
	 * 初始化方法，用于资源申请，所有测试方法在执行前都会先执行该方法
	 */
	@Before
	public void init() {
		System.out.println("init...");
		System.out.println("ff");
	}
	
	/*
	 * 释放资源的方法，在所有测试方法执行完后都会自动执行该方法
	 */
	@After
	public void close() {
		System.out.println("close...");
	}
	
	/*
	 * 测试add方法
	 */
	@Test
	public  void testAdd() {
		Calculator cal = new Calculator();
		int result = cal.add(1, 2);
		System.out.println(result);
		
		// 断言结果 我断言这个结果是3
		Assert.assertEquals(3, result); // 红了，说明错误
	}
	
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int result = cal.sub(1, 2);
		System.out.println("testSub...");
		System.out.println(result);
		
		// 断言结果 我断言这个结果是-1
		Assert.assertEquals(-1, result); // 绿色，说明成功
	}
	
}
