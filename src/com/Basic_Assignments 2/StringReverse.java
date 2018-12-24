
public class StringReverse {

	public String change(String string) 
	{
		char character[]=string.toCharArray();
		String reversestring="";
		int counter=0;
		for(counter=0;counter<character.length;counter++)
		{
			int temporaryNumber=counter;
			while(counter<character.length && character[counter]!=' ')
			{
				counter++;
			}
			int readchar=counter-1;
			while(readchar>=temporaryNumber)
			{
				reversestring=reversestring+character[readchar];
				readchar--;
			}
			if(counter<character.length)
			{
				reversestring=reversestring+character[counter];
			}
		}
		return reversestring;
	}



}
