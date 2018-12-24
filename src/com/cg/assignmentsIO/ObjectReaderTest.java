package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class ObjectReaderTest {
	private  ObjectReader objectReader;
	@Before
	public void setUp(){
		objectReader = new ObjectReader();
	}

	@Test
	public void writerTest() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("C:\\Users\\ptalluru\\Desktop\\Object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjectReader read = objectReader.displayEmployees(ois);
		System.out.println(read);
		//String expected = "Employee [id=1, Name=Ajay, salary=0.0]";
		//assertEquals(expected,actual);
	}
}
