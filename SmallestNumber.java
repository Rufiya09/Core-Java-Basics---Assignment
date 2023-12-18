//Write a Java method to find the smallest number among three numbers. 

import java.util.Scanner;
public class SmallestNumber
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	
	int num2 = sc.nextInt();
	
	int num3 = sc.nextInt();
	
	if(num1<num2)
	if(num1<num3){
	System.out.println("num1 is smallest:" + num1);
	}
	if(num2<num1)
	if(num2<num3){
	System.out.println("num2 is smallest:" + num2);
	}
	if(num3<num2)
	if(num3<num1){
	System.out.println("num3 is smallest:" + num3);
	}
	sc.close();
	}
}
	
	
	
	