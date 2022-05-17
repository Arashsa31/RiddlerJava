/**
 * @author Arash
 *
 *Holy digits Batman! The Riddler is planning his next caper somewhere on Pennsylvania Avenue. 
 *In his usual sporting fashion, he has left the address in the form of a puzzle. 
 *The address on Pennsylvania is a four-digit number where:
 *
 *All four digits are different
 *The digit in the thousands place is three times the digit in the tens place
 *The number is odd
 *The sum of the digits is 27
 *
 *Write a program that uses a loop (or loops) to find the address where the Riddler plans to strike
 */
public class Riddler 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		for(int i = 0; i<9999; i++)
		{
			flag = isDifferent(i) && largerNumber(i) && isOdd(i) &&	sum(i);
			
			if(flag)
				System.out.println("The address is located at "+ i + " Pennsylvania Avenue.");
		}
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	static boolean isDifferent(int number)
	{
		int d1 = number % 10; //one
		int d2 = number / 10 % 10; //ten
		int d3 = number / 100 % 10; //hundred
		int d4 = number /1000 % 10; //thousand
		
		if (!(d1 == d2 || d1 == d3 || d1 == d4 || 
			d2 == d3 || d2 == d4 ||
			d3 == d4))
			return true;
		/* !( = || ) same as ( != && )
		if (d1 != d2 && d1 != d3 && d1 != d4 && 
				d2 != d3 && d2 != d4 &&
				d3 != d4)
				return true; */
		else return false;
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	static boolean largerNumber(int number)
	{
		int d4 = number / 1000 % 10;
		int d2 = number / 10 % 10;
		
		if (d4 == 3*d2)
			return true;
		else return false;
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	static boolean isOdd(int number) 
	{
		if(number%2 == 1)
			return true;
		else return false;
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	static boolean sum(int number)
	{
		int d1 = number % 10;
		int d2 = number / 10 % 10;
		int d3 = number / 100 % 10;
		int d4 = number /1000 % 10;
		
		if (27 == d1 + d2 + d3 + d4)
			return true;
		else return false;
	}	 
}
