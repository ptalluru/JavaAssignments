
public class Discount
{
	public int itemDiscount(int itemValue) 
	{
		int newItemValue=0;
		if(itemValue>=0)
		{
			int discount=(itemValue*35)/100;
			 newItemValue=itemValue-discount;
		}
		
		return newItemValue;
	}

}
