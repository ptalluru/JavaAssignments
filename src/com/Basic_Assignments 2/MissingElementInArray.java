public class MissingElementInArray 
{
	public int getMissingElement(int[] numbers) 
	{
		for (int i = 0; i < numbers.length; i++)
		{ 
			for (int j = 0; j < numbers.length - 1; j++) 
			{
				if (numbers[j] > numbers[j + 1]) 
				{
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i]!=i)
				{
					return i;
				}
			}
		return numbers.length;
	}
}