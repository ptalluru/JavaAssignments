package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

public class ObjectWriterTest {
	private ObjectWriter objectWriter,objectWriter1,objectWriter2,objectWriter3,objectWriter4;
	@Before
	public void setUp(){
		objectWriter = new ObjectWriter(1,"Ajay",1000);
		objectWriter1 = new ObjectWriter(2,"Hema",1000);
		objectWriter2 = new ObjectWriter(3,"Prasanth",1000);
		objectWriter3 = new ObjectWriter(4,"Google",1000);
		objectWriter4 = new ObjectWriter(5,"Priyanka",1000);
		
	}

	@Test
	public void test() throws IOException {
		ObjectWriter[] objectsArray ={objectWriter,objectWriter1,objectWriter2,objectWriter3,objectWriter4};
		FileOutputStream fw = new FileOutputStream("C:\\Users\\ptalluru\\Desktop\\Object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fw);
		oos.writeObject(objectsArray);
		oos.close();
		fw.close();
	}

}
