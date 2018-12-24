package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CountWordsInFileTest {
	private CountWordsInFile countWordsInFile;
	@Before
	public void setUp(){
		countWordsInFile = new CountWordsInFile();
	} 
	@Test
	public void test() {
		try {
			int actual = countWordsInFile.display("C:\\Users\\ptalluru\\Desktop\\Demo.txt");
			assertEquals(7,actual);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
