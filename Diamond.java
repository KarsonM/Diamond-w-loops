//****************************************************
//Programmer:  Karson Mathews
//Homework 1:  Diamond Pattern
//Date:        8/31/21
//Description: This program prints out a diamond shape of
//			   asterisks with my name following underneath 
//		       the diamond
//****************************************************** 

//The class we will be using for this solution is called here, Diamond
public class Diamond
{
	public static void main(String[] args)
	{
		int n = 6; //Assigning set number for diamond
		for(int i = 1; i <= n; i++) //First loop is checking to make sure my number is larger than or equal to 1.
		{ //This loop creates the upper section of the diamond.
			for(int k = 1; k <= n-i; k++) //n-i creates the necessary spaces needed for the shape of the diamond
			{
				System.out.print(" "); //Whitespace for shape of diamond
			}
			for(int k = 1; k <= i*2-1; k++) //This loop creates the total number of asterisks needed for the next line by i*2-1
			{
			System.out.print("*"); //printing asterisks 
			}
		System.out.println(); //Going to next line to continue diamond pattern.
		}
		//For loop for bottom section of the diamond which is essentially the opposite of the prior for loop.
		for(int i = n-1; i > 0; i--)
		{
			for(int k = 1; k <= n-i; k++) //n-i creates the necessary spaces needed for the shape of the diamond
			{
				System.out.print(" "); //Whitespace for shape of diamond
			}
			for(int k = 1; k<= i*2-1; k++) //This loop creates the total number of asterisks needed for the next line by i*2-1
			{
			System.out.print("*"); //printing asterisks 
			}
			System.out.println(); //new line
		}
	System.out.print("Karson Mathews"); //Printing my name
	}
}