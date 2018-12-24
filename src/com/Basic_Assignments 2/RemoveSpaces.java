public class RemoveSpaces 
{
	public String identifyAndRemoveSpacesInString(String input, String wordToBeDeleted, int wordPositionInSentence) {
		StringBuffer sb=new StringBuffer();
		String[] splittedString=input.split("\\s+");
		for(int i=0;i<splittedString.length;i++)
		{
			if(!((i+1)==wordPositionInSentence && wordToBeDeleted.equals(splittedString[i])))
			{
				sb.append(splittedString[i]+" ");
			}
		}
		return sb.toString();
	}
}
