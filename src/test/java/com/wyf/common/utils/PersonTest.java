package com.wyf.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i < 10000; i++) {
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(0, 120));
			person.setAbout(StringUtil.randomChineseString(10));
			Calendar c = Calendar.getInstance();
			c.set(2010, 3, 1);
			person.setCreated(DateUtil.random(c.getTime(), new Date()));
			System.out.println("第"+i+"个人：----"+person);
		}
	}

}
