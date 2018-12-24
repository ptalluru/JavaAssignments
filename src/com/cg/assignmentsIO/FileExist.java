package com.cg.assignmentsIO;

import java.io.File;

public class FileExist {
	public boolean display(String string){
		File file = new File(string);
		if(file.exists())
			return true;
		else
			return false;
	}
}
