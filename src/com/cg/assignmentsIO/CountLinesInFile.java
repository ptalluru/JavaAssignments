package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesInFile {
	public int display(String string) throws IOException{
		File file = new File(string);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int count = 0;
		while(bufferedReader.readLine()!=null){
			count++;
		}
		return count;
	}

}
