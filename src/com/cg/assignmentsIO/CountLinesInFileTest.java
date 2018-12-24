package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CountLinesInFileTest {
	private CountLinesInFile countLinesInFile;
	@Before
	public void setUp(){
		countLinesInFile = new CountLinesInFile();
	}
	@Test
	public void test() {
			try {
				int actual = countLinesInFile.display("C:\\Users\\ptalluru\\Desktop\\Demo.txt");
				assertEquals(4,actual);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
