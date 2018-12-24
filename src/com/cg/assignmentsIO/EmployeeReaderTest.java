package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeReaderTest {
	private  EmployeeReader employeeReader;
	@Before
	public void setUp(){
		employeeReader = new EmployeeReader();
	}

	@Test
	public void writerTest() throws IOException{
		FileReader fw = new FileReader("C:\\Users\\ptalluru\\Desktop\\Employee.txt");
		String actual = employeeReader.displayEmployee(fw);
		String expected = "Employee [id=1, Name=Ajay, salary=0.0]";
		assertEquals(expected,actual);
	}
}
