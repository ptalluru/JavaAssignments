import java.util.Scanner;
class MarksCheck

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of first subject : ");
		float subject1 = sc.nextFloat();
		System.out.println("Enter the marks of first subject : ");
		float subject2 = sc.nextFloat();
		System.out.println("Enter the marks of first subject : ");
		float subject3 = sc.nextFloat();
		if((subject1>60 && subject1<=100)&&(subject2>60 && subject1<=100)&&(subject3>60 && subject1<=100))
		{
			System.out.println("You are passed !!!");
		}
		else if(((subject1>60 && subject1<=100) && (subject2>60 && subject1<=100))||((subject2>60 && subject2<=100) && (subject3>60 && subject3<=100))||((subject3>60 && subject3<=100) && (subject1>60 && subject1<=100)))
		{
			System.out.println("You are promoted !!!");
		}
		else if(((subject1>60&& subject1<=100) && subject2<60 && subject3<60)||(subject1<60 && (subject2>60 && subject2<100) && subject3<60)||(subject1<60 && subject2<60 && (subject3>60 && subject3<100)))
		{
			System.out.println("Sorry !! you are failed");
		}
		if(subject1>100 || subject2 >100 ||subject3>100)
		{
			System.out.println("Maximum marks should be less than or equal to 100 ");
		}
	}
}