package com.xiang.demo.junit.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.xiang.demo.junit.utils.WordDealUtil;

/**
 * 
 * <p>
 * ClassName:WordDealUtilTestWithParam
 * </p>
 * <p>
 * Description: 参数化测试 <p>
 * 
 * 为了保证单元测试的严谨性，我们经常要模拟很多种输入参数，来确定我们的功能代码是可以正常工作的，为此我们编写大量的单元测试方法。可是这些测试方法都是大同小异：代码结构都是相同的，不同的仅仅是测试数据和期望输出值。
 * JUnit4 的参数化测试方法给我们提供了更好的方法，将测试方法中相同的代码结构提取出来，提高代码的重用度，减少复制粘贴代码的痛苦。
 * </p>
 * <p>
 * </p>
 * 
 * @author hairui
 * @date 2017年2月20日 下午4:26:56
 */
@RunWith(Parameterized.class)
public class WordDealUtilTestWithParam {

	private String expected;

	private String target;

	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection words() {
		return Arrays.asList(new Object[][] { { "employee_info", "employeeInfo" }, // 测试一般的处理情况
				{ null, null }, // 测试 null 时的处理情况
				{ "", "" }, // 测试空字符串时的处理情况
				//{"employee_a_info", "123456"}, //测试失败情况
				{ "employee_info", "EmployeeInfo" }, // 测试当首字母大写时的情况
				{ "employee_info_a", "employeeInfoA" }, // 测试当尾字母为大写时的情况
				{ "employee_a_info", "employeeAInfo" } // 测试多个相连字母大写时的情况
		});
	}

	/**
	* 参数化测试必须的构造函数
	* @param expected     期望的测试结果，对应参数集中的第一个参数
	* @param target     测试数据，对应参数集中的第二个参数
	*/

	public WordDealUtilTestWithParam(String expected, String target) {
		super();
		this.expected = expected;
		this.target = target;
	}

	/**
	 * 测试 Java 名称对象到数据库名称的转换
	 */
	@Test
	public void wordFormat4DB() {

		Assert.assertEquals(expected, WordDealUtil.wordFormat4DB(target));

	}

	
}
