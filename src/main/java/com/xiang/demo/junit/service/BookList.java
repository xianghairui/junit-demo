package com.xiang.demo.junit.service;

import org.springframework.util.StringUtils;

import com.xiang.demo.junit.exception.BusinessException;

public class BookList {

	public String execute() throws Exception {
		String name = "";
		if (StringUtils.isEmpty(name)) {
			throw new BusinessException("~", "name cant't empty.");
		}
		return name;
	}
}
