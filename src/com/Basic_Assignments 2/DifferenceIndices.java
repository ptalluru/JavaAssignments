
public class DifferenceIndices 
{
	public boolean isDistinctValue(int[] array, int k) 
	{
		int counter,counter1,difference=0;
		for(counter=0;counter<array.length;counter++)
		{
			for(counter1=counter+1;counter1<array.length;counter1++)
			{
				if(array[counter]==array[counter1])
				{
					difference=counter1-counter;
				}
			}
		}
		if(difference<=k)
			return true;
		else
			return false;
	}



}
