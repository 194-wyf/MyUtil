package com.wyf.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String str="aaa.jpg";
		String extendName = FileUtil.getExtendName(str);
		System.out.println(extendName);
	}

	@Test
	public void testGetTemDirectory() {
		File file = FileUtil.getTemDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);

	}

}
