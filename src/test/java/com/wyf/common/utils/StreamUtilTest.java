package com.wyf.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String path="C:\\Users\\Richard\\Desktop\\one.txt";
		String file = StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(file);
	}

	@Test
	public void testReadTextFileFile() {
		String path="C:\\Users\\Richard\\Desktop\\one.txt";
		String file = StreamUtil.readTextFile(new File(path));
		System.out.println(file);
		
	}

	@Test
	public void testReadTextFileList() {
		String path="C:\\Users\\Richard\\Desktop\\one.txt";
		List<String> list = StreamUtil.readTextFileList(new File(path));
		for (String string : list) {
			System.out.println(string);
			
		}
	}

}
