package com.xiang.demo.junit.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDealUtil {
	
	/**
	 * 格式化字符串，将驼峰规则的字符串以"_"分隔
	 * @param name 字符串
	 * @return
	 */
	public static String wordFormat4DB(String name) {	
		if (name == null) {
			return null;
		}
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(name);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			if (m.start() != 0) {
				m.appendReplacement(sb, ("_" + m.group()).toLowerCase());
			}
		}
		return m.appendTail(sb).toString().toLowerCase();
	}
	
}
