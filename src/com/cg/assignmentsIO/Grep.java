package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Grep {
	public String displayLineAndLineNumber(FileReader fr,String searchWord) throws IOException{
	String lineAndLineNumber="";
	String line ="";
	int lineNumber = 0;
	BufferedReader br = new BufferedReader(fr);
	while((line = br.readLine())!= null){
		lineNumber++;
		String[] words = line.split(" ");
		for (int counter=0;counter<words.length;counter++){
			if(words[counter].equals(searchWord)){
				lineAndLineNumber += lineNumber+ " "+line+"\n";
			}
		}
	}
	System.out.println(lineAndLineNumber);
	return lineAndLineNumber;
	}
}
