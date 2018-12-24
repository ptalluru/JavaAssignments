import java.util.*;

class Date

{

	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Date/month/year");

		String date=sc.next();

		int month=sc.nextInt();

		int year=sc.nextInt();

		String s[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};

		System.out.println(date+"/"+s[month]+"/"+year);

	}

}