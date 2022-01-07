package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// first two number remains 0,1
		//third number will be additoon of previous two numbers
		//0,1,1(0+1),2(1+1)

		int firstno = 0;
		int secondno = 1;
		System.out.println(firstno);
		System.out.println(secondno);
		for(int i = 1;i<=6;i++)
		{
			int thirdnumber;
			thirdnumber = firstno + secondno;
			System.out.println(thirdnumber);
			firstno=secondno;
			secondno=thirdnumber;
			
			
			
		}
			
		
	}

}
