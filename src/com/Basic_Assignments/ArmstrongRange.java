class ArmstrongRange
{
	public static void main(String[] args)
	{
		ArmstrongRange ar = new ArmstrongRange();
		ar.function();
	}
		void function(){
		int remainder,temporaryNumber,sum=0;
		System.out.println("Armstrong numbers from 100 to 999 are : ");
		for(int i=100;i<=999;i++)
		{
			temporaryNumber=i;
			while(temporaryNumber!=0)
			{
			remainder=temporaryNumber%10;
			sum=sum+(remainder*remainder*remainder);
			temporaryNumber=temporaryNumber/10;
			}
			if(sum==i)
			{
			System.out.println(i+" is an armstrong number");
			}
			sum=0;
		}
		}
	}
}