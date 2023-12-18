//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

//Method Name	calculateSum
//Method Description	Calculate Sum
//Argument	int n
//Return Type	int-sum
//Logic	Calculate the sum of first n natural numbers which are divisible by 3 or 5.


public class CalculateSum
{	

	public static int calculateSum(int n)
	{
		int sum =0;
		
		for(int i=1;i<=n;i++){
			if(i % 3 == 0 || i % 5 == 0){
			sum += i;
		}
	}
	
		return sum;
	}
		
	public static void main(String args[])
	{
		int n = 10;
		int result = calculateSum(n);
		System.out.println("sum of first n natural numbers :" + n + "natural numbers which are divisible by 3 or 5 :" + result);
	}
}