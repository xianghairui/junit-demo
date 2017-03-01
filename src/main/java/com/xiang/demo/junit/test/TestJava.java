package com.xiang.demo.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * <p>ClassName:TestJava</p>
 * <p>Description: JUnit4注解解释</p>
 *  
 * <p>1. @Test : 测试方法，测试程序会运行的方法，后边可以跟参数代表不同的测试，如(expected=XXException.class) 异常测试，(timeout=xxx)超时测试
 * <p>2. @Ignore : 被忽略的测试方法
 * <p>3. @Before: 每一个测试方法之前运行
 * <p>4. @After : 每一个测试方法之后运行
 * <p>5. @BeforeClass: 所有测试开始之前运行
 * <p>6. @AfterClass: 所有测试结束之后运行
 * <p>fail方法是指测试失败
 * <p>assertEquals测试2个参数是否相等，具体参考相应API</p>
 * @author hairui
 * @date 2017年2月20日 下午4:59:25
 */
public class TestJava {
	
	@Test  
    public void testMain() {  
        fail("Not yet implemented");  
    }

	@Test
	public void testTest() {
		System.out.println("@Test");// 调用自己要测试的方法
	}

	@Test
	public void testAssert() {
		assertEquals("chenleixing", "chenlei");
	}

	@Test(timeout = 1)
	public void testTimeout() {
		System.out.println("超时测试");
	}

	@Before
	public void testBefore() {
		System.out.println("@Before");
	}

	@BeforeClass
	public static void testBeforeClass() {// 必须为静态方法
		System.out.println("@BeforeClass");
	}

	@After
	public void testAfter() {
		System.out.println("@After");
	}

	@AfterClass
	public static void testAfterClass() {// 必须为静态方法
		System.out.println("@AfterClass");
	}

	@Ignore
	public void testIgnore() {
		System.out.println("@Ignore");
	}

}
