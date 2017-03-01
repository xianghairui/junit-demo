package com.xiang.demo.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.xiang.demo.junit.exception.BusinessException;
import com.xiang.demo.junit.service.BookList;

/**
 * 
 * <p>ClassName:AdditionTest</p>
 * <p>Description: TODO</p>
 * <p></p>
 * @author hairui
 * @date 2017年2月20日 下午3:42:40
 */
public class AdditionTest{
	
	private int x = 1;
	private int y = 1;
	
	@Test
	public void testAddition(){
		int z = x + y;
		System.out.println("执行test......");
		assertEquals(2, z);
	}
	
	@Before
	public void init(){
		System.out.println("初始化。。。。。");
	}
	
	@Test(expected = BusinessException.class)
	public void testExceptionNameEmpty() throws Exception {
		BookList bookList = new BookList();
		bookList.execute();
	}
	
	@After
	public void destroy(){
		System.out.println("执行after。。。。。。");
	}
	
}
