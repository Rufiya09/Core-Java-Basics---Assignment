//Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.

//Method Name	calculateDifference
//Method Description	Calculate the difference
//Argument	int n
//Return Type	int - Sum
//Logic	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum.
//For Example if n is 10,you have to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2

public class CalculateDifference {
	
public static int calculateDifference(int n){
		int sum = 0;
		int sumofsquares = 0;
		int sumsquared = 0;
		
		// Calculate the sum of the squares and the sum of the numbers
		for(int i=1;i<=n;i++){
			sum+= i;
			sumofsquares+= i*i;
		}
             // Calculate the square of the sum
			int sumsquared = sum * sum;
			
			// Calculate the difference
			int difference = sumofsquares - sumsquared;
		
	
			return difference;
    }	
public static void main(String args[]){
		int n = 10;
		int result = calculateDifference(n);
		System.out.println("sum of first n natural numbers:" + n);
	    System.out.println("difference between the sum of the squares and the square of the sum of the first n natural numbers:"+ result);
     }
}
