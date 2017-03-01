package com.xiang.demo.junit.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.xiang.demo.junit.service.Calculator;

@RunWith(Parameterized.class)
public class SquareTest {

	private static Calculator calculator = new Calculator();
	
	private int param;
	
	private int result;
	
	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{
			{2, 4},
			{0, 0},
			{-3, 9}
		});
	}
	
	/**
	 * 
	 * @param param 参数
	 * @param result 结果
	 */
	public SquareTest(int param, int result) {
		super();
		this.param = param;
		this.result = result;
	}
	
	@Test
	public void square() {
		calculator.square(param);
		assertEquals(result, calculator.getResult());
	}
	
	
}
