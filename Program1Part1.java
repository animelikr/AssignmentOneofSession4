
public class Program1Part1 {

	public static void main(String[] args) {
		
	//program to print sum of two numbers: one number is int and other is float
		//output should be integer --> use type casting		
System.out.println("This program will print the sum of 2 digits: an integer and a float");

   int a = 10;
   float b = 100.02f;
       //explicit conversion needed for converting float to int
    float sum1 = a + b; 
      //int sum = a + b;
  int sumfinal = (int) sum1;
     // System.out.println("The sum of variables a and b is:"+sum1);
	
	System.out.println("The sum of the variables a and b is:"+sumfinal);
	}

}
