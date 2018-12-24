package com.cg.assignmentsIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public ObjectReader displayEmployees(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		/*String line ="";
		//String storeLine="";
		while(()!= null){
		//line+=storeLine;
		}
		System.out.println(line);*/
		System.out.println((ObjectReader) ois.readObject());
		return (ObjectReader) ois.readObject();
	}

}



/*ArrayList<Object> objectsList = new ArrayList<Object>();
boolean cont = true;
try{
   ObjectInputStream input = new ObjectInputStream(fis);
   while(cont){
      Object obj = input.readObject();
      if(obj != null)
         objectsList.add(obj);
      else
         cont = false;
   }
}catch(Exception e){
   //System.out.println(e.printStackTrace());
}
*/

