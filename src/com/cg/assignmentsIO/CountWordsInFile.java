package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountWordsInFile {
	public int display(String string) throws IOException{
		File file = new File(string);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = "", stringStorage = "";
		int wordsCount = 0;
		while ((line = bufferedReader.readLine()) != null) {
			stringStorage += line + " ";
		}
		System.out.println(stringStorage);
		 
		StringTokenizer st = new StringTokenizer(stringStorage);
		while (st.hasMoreTokens()) {
		String s = st.nextToken();
		wordsCount++;
		}
		System.out.println("File has " + wordsCount + " words are in the file");
		return wordsCount;
		}
		 
	}



