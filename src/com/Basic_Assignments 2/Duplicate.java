
public class Duplicate {

	public String removeDuplicate(String word1) {
		String afterRemovingDuplicates =new String();
		int size=word1.length();
		for(int index = 0;index<size;index++)
		{
			 if(!afterRemovingDuplicates.contains(String.valueOf(word1.charAt(index)))) 
			 {

				 afterRemovingDuplicates+= String.valueOf(word1.charAt(index));  
		        	}
			
		}
		return afterRemovingDuplicates;
	}

}
