package com.cg.assignmentsIO;



import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeWriterTest{
	private  EmployeeWriter employee;
	@Before
	public void setUp(){
		employee = new EmployeeWriter(1,"Ajay",0);
	}

	@Test
	public void writerTest() throws IOException{
		String details = employee.toString();
		FileWriter fw = new FileWriter("C:\\Users\\ptalluru\\Desktop\\Employee.txt");
		fw.write(details);
		fw.close();
	}
}
