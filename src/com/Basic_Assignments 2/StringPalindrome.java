public class StringPalindrome
{
	public String[] checkPalindromAndSortArrayInDescendingOrder(String[] input) 
	{
		int palindromeNumberCount = 0;
		for (String word : input)
		{
			if (isPalindrome(word)) 
			{
				palindromeNumberCount++;
			}
		}
		String[] words = new String[palindromeNumberCount];
		int wordsCountInArray = 0;
		for (String word : input)
		{
			if (isPalindrome(word)) 
			{
				words[wordsCountInArray] = word;
				wordsCountInArray++;
			}
		}
		for (int i = 0; i < words.length - 1; i++) 
		{
			for (int j = i + 1; j < words.length; j++) 
			{
				if (words[i].compareTo(words[j]) < 0)
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		return words;
	}
	public boolean isPalindrome(String word) 
	{
		StringBuffer sb = new StringBuffer();
		for (int i = word.length() - 1; i >= 0; i--)
		{
			sb.append(word.charAt(i));
		}
		return word.equals(sb.toString());
	}
}