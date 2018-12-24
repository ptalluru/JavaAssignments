import java.util.Scanner;

class TableSquare
{
	static int multiplication(int number,int i)
	{
		int multiply=number*i;
		return multiply;
    	}
	static double square(int multiply)
        {
		double squareNumber=Math.pow(multiply,2); 
		return squareNumber;
        }	
	public static void main(String[] args)
        {
		int number;
    		double square;
    		Scanner s = new Scanner(System.in);
    		System.out.print("Enter the number");
    		number= s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int value=multiplication(number,i);
			double squareNumber=square(value);
               		System.out.println(+number +"*"+i+"="+value+"----------"+squareNumber);	
		}
	}
}