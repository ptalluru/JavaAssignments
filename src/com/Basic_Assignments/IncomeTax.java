import java.util.*;
class IncomeTax
{
	public static void main(String[] args)
	{
		float ctc,slabA,slabB,slabC,slabD,incomeTax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your CTC to calculate the income tax amount");
		ctc = sc.nextFloat();
		if(ctc>=0 && ctc<=180000)
		{
			incomeTax=0;
			System.out.println("Income tax of your CTC is :"+incomeTax);
		}
		else if(ctc>=180001 && ctc<=300000)
		{
			incomeTax=(ctc*10)/100;
			System.out.println("Income tax of your CTC is :"+incomeTax);
		}
		else if(ctc>=300001 && ctc<=500000)
		{
			incomeTax=(ctc*20)/100;
			System.out.println("Income tax of your CTC is :"+incomeTax);
		}
		else if(ctc>=500001 && ctc<=1000000)
		{
			incomeTax=(ctc*30)/100;
			System.out.println("Income tax of your CTC is :"+incomeTax);
		}
	}
}