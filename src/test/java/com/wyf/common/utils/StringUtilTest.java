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
	
	@Test
	public void testIsNumber() {
		String str="324a";
		boolean b = StringUtil.isNumber(str);
		if (b) {
			System.out.println("是");
		}else {
			System.out.println("否");
		}
		
	}
	@Test
	public void testIsPhone() {
		String str="13818";
		boolean b = StringUtil.isPhone(str);
		if (b) {
			System.out.println("是");
		}else {
			System.out.println("否");
		}
		
	}
	@Test
	public void testIsEmail() {
		String str="";
		boolean b = StringUtil.isEmail(str);
		if (b) {
			System.out.println("是");
		}else {
			System.out.println("否");
		}
		
	}
}
