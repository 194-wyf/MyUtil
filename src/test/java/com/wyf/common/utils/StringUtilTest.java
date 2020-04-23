package com.wyf.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String str = StringUtil.randomChineseString(50);
		System.out.println(str);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
