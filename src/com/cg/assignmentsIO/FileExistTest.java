package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class FileExistTest {
	private FileExist fileExist;
	
	@Before
	public void setUp(){
	fileExist = new FileExist();
	}
	
	@Test
	public void fileExistsCheck() {
		boolean expected =true;
		boolean actual=fileExist.display("C:\\Users\\ptalluru\\Desktop\\Intermediate Inheritence Assignment 3.txt");
		assertEquals(expected,actual);
	}
	
	@Test
	public void fileNotExistsCheck() {
		boolean expected =false;
		boolean actual=fileExist.display("C:\\Users\\ptalluru\\Desktop\\Intermediate Inheritence Assignment.txt");
		assertEquals(expected,actual);
	}

}
