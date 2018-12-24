
public class Palindrome {

	public boolean isPalindrome(int number)
	{
		int temporaryNumber=number;
		int sum=0;
		if(number>=10)
		{
			while(number!=0)
			{
				int remainder=number%10;
				sum=sum*10+remainder;
				number=number/10;
			}
			return sum==temporaryNumber;
		}
		return false;
	}


}
