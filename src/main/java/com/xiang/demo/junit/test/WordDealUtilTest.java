package com.xiang.demo.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.xiang.demo.junit.utils.WordDealUtil;

public class WordDealUtilTest {

	/**
	 * 测试 null 是的处理情况
	 */
	@Test
	public void wordFormat4DBNumm() {
		String target = null;
		String result = WordDealUtil.wordFormat4DB(target);
		assertNull(result);
	}

	/**
	 * 
	 * 测试空字符串的处理情况
	 * 
	 */
	@Test
	public void wordFormat4DBEmpty() {

		String target = "";

		String result = WordDealUtil.wordFormat4DB(target);

		assertEquals("", result);

	}

	/**
	 * 
	 * 测试当首字母大写时的情况
	 * 
	 */
	@Test
	public void wordFormat4DBegin() {

		String target = "EmployeeInfo";

		String result = WordDealUtil.wordFormat4DB(target);

		assertEquals("employee_info", result);

	}

	/**
	 * 
	 * 测试当尾字母为大写时的情况
	 * 
	 */
	@Test
	public void wordFormat4DBEnd() {

		String target = "employeeInfoA";

		String result = WordDealUtil.wordFormat4DB(target);

		assertEquals("employee_info_a", result);

	}

	/**
	 * 
	 * 测试多个相连字母大写时的情况
	 * 
	 */

	@Test

	public void wordFormat4DBTogether() {

		String target = "employeeAInfo";

		String result = WordDealUtil.wordFormat4DB(target);

		assertEquals("employee_a_info", result);

	}

}
