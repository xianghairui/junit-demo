package com.xiang.demo.junit.exception;

/**
 * 
 * <p>ClassName:BusinessException</p>
 * <p>Description: 异常处理</p>
 * <p></p>
 * @author hairui
 * @date 2017年3月1日 上午10:51:50
 */
public class BusinessException extends Exception{

	public BusinessException(String string, String string2) {
		System.out.println(string + ", " + string2);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
}
