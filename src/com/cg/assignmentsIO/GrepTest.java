package com.cg.assignmentsIO;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class GrepTest {
	private Grep grep;
	@Test
	public void searchWord() throws IOException {
		grep = new Grep();
		FileReader fr = new FileReader("C:\\Users\\ptalluru\\Desktop\\Demo.txt");
		String searchWord = "is";
		grep.displayLineAndLineNumber(fr, searchWord);
	}

}
