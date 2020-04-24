package com.wyf.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	private static final Date Date = null;

	@Test
	public void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 9, 1);
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		System.out.println(format);
	}
	@Test
	public void testGetIntMouth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 7, 4);
		Date intMonth = DateUtil.getIntMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String format = sdf.format(intMonth);
		System.out.println(format);
	}
	
	@Test
	public void testGetEndMouth() {
		Date endMonth = DateUtil.getEndMonth(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = sdf.format(endMonth);
		System.out.println(format);
	}
	@Test
	public void testGetAgeByBrithday() {
		Calendar c = Calendar.getInstance();
		c.set(1996, 10, 30);
		int age = DateUtil.getAgeByBrithday(c.getTime());
		System.out.println(age);
	}
}
