package com.wyf.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(2, 5);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] arr = RandomUtil.subRandom(2,10, 5);
		
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testrandomString() {
		String str = RandomUtil.randomString(5);
		System.out.println(str);
	}

}
