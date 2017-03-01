package com.xiang.demo.junit.service;

/**
 * 
 * <p>ClassName:Calculator</p>
 * <p>Description: 计算类</p>
 * <p></p>
 * @author hairui
 * @date 2017年3月1日 上午10:52:32
 */
public class Calculator {
	
	private static int result;// 静态变量，用于存储运行结果

	/**
	 * 加
	 * @param n
	 */
	public void add(int n) {
		result = result + n;
	}

	/**
	 * 减
	 * @param n
	 */
	public void substract(int n) {
		result = result - 1; // Bug: 正确的应该是 result =result-n
	}

	/**
	 * 乘
	 * @param n
	 */
	public void multiply(int n) {
	} // 此方法尚未写好

	/**
	 * 除
	 * @param n
	 */
	public void divide(int n) {
		result = result / n;
	}

	/**
	 * 平方
	 * @param n
	 */
	public void square(int n) {
		result = n * n;
	}

	/**
	 * 循环
	 * @param n
	 */
	public void squareRoot(int n) {
		for (;;)
			; // Bug : 死循环
	}

	/**
	 * 结果清0
	 */
	public void clear() { // 将结果清零
		result = 0;
	}

	/**
	 * 结果
	 * @return
	 */
	public int getResult() {
		return result;
	}
}
