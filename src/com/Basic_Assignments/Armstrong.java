import java.util.Scanner;
class Armstrong
{
	void armstrongNumber()
	{
		int number, temporary_number,count=0,sum=0,remainder;
		
		System.out.println("Enter the number to know whether it is armstrong or not !!");
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		temporary_number=number;
		
		while(temporary_number!=0)
		{
			count++;
			temporary_number=temporary_number/10;
		}
		temporary_number=number;
		while(temporary_number!=0)
		{
			remainder=temporary_number%10;
			sum=sum+power(remainder,count);
			temporary_number=temporary_number/10;
		}
		if(number==sum)
		{
			System.out.println("Entered number is an armstrong number !!");
		}
		else
		{
			System.out.println("Entered number is not an armstrong number !!");	
		}
		
	}
	int power(int remainder, int count)
		{
			int flag=1;
			while(count!=0)
			{
				flag=flag*remainder;
				count--;
			}
			return flag;
		}

	public static void main(String[] args)
	{
		Armstrong a = new Armstrong();
		a.armstrongNumber();
	}
}