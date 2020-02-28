/*
//Name: Alicia Gerard  
//Class: CIS 1500
//Purpose: Completing the functions within the program through mulitple functions.  

Copy this class and paste it in to your development environment (e.g., jGRASP).  
Leave the main method EXACTLY as it is -- do not change a line of main. 
Write the many missing methods.

Write the methods so that the methods will work for ANY reasonable input values
and NOT JUST FOR THE EXACT values sent in the main method below.

Use good, descriptive variable names inside your methods.

*/

public class LotsOfMethods
{
	public static void main(String [] args)
	{
		// Sample method getting called.  Just reports the String sent to the method
		// by printing "Received: " followed by the String.
		
		sampleMethod("hello");
		sampleMethod("there");
		
		// For the received integer value, report whether or not it is odd.
		// It should work for any integer value (not just those used below).
		// It reports a message of the format "16 is not odd" or "1 is odd".
		
		reportOdd(3);
		reportOdd(100);
		reportOdd(77);
		
		// Assume that the two values represent the width and height of
		// a rectangle.  Report the area of the rectangle with a line of 
		// the form "Area is 100.0 for a rectangle of width 10.0 and height 10.0".
		// Print one digit after the decimal point.
		
		printArea(10.00, 10.0);
		printArea(3.555, 19.4);
		printArea(600.5, 1.1);
		
		// Assume that the values sent to stockSale are a String representing
		// the name of the company, an integer representing the number of shares
		// of the stock that were sold, and the price the stock was sold at.
		// Report the information about the sale in a line of output of this 
		// format:
		//
		//       Sold 50 shares of IBM at $35.50 for $1,775.00
		// 
		
		stockSale("IBM", 50, 35.5);
		stockSale("Apple", 100, 440.25);
		stockSale("GM", 25, 12.75);
		
		// Write the method determineTax.  The method is sent the amount of the
		// purchase and the tax rate.  It returns a double value that is the 
		// amount of the tax.
		// Note that the method determineTax does not print anything -- it 
		// just returns the value.
		
		double m1 = determineTax(350.00, 0.06);  // Michigan is 6%
		double m2 = determineTax(79.99, 0.06);
		
		double cal1 = determineTax(499.99, 0.0725);  // California is 7.25%
		
		System.out.printf("Here are the returned values: %.2f, %.2f, and %.2f\n", m1, m2, cal1);
		
		// Reports the grade that corresponds to the test score supplied, according to this scale:
		// A: 100-90, B: 89-80, C: 79-70, D: 69-60, E: 59-0.  Report "Invalid" for any other score.
		// Invalid scores should be reported like this: "110 is an invalid score". 
		// Valid scores should be reported like this: "70 has a grade of C".
		
		testScore(93);
		testScore(70);
		testScore(110);
		testScore(-3);
		testScore(52);
		testScore(88);
		
		// In the gambling game of craps the gambler rolls two dice.  The first roll of the dice 
		// has several different outcomes.  If a 2, 3, or 12 is rolled then the gambler "craps out" (i.e, 
		// they lose).  If they roll a 7 or 11 then they "win".  If they roll any other number then
		// they "keep rolling". 
		// Write a method that takes the two dice and reports one of the three possible outcomes:
		//   * "crap out"
		//   * "win"
		//   * "keep rolling"
		//
		// This method just reports the status of just the first roll.
		
		firstRoll(2, 3);
		firstRoll(6, 1);
		firstRoll(4, 5);
		firstRoll(4, 3);
		firstRoll(6, 6);
		
		// Write a method waterState that takes a single double value as a parameter that indicates the 
		// temperature of the water.  Your method will return a single String indicating the state of water
		// at that temperature.  The three possible states are "solid", "liquid", or "gas". I.e., water is 
		// solid, as ice, at 32 degrees or less, it is a gas (steam) at 212 degrees and above, and it is a 
		// liquid between 32 and 212.
		
		String w1 = waterState(76.5);  // 76 degrees -- liquid water
		System.out.println("w1 is: " + w1);
		
		String w2 = waterState(17.7);
		System.out.println("For 17 it is: " + w2);
		
		String w3 = waterState(32.0);
		System.out.println("Right at 32 is is frozen: " + w3);
		
		System.out.println("Hot: " + waterState(250.0));
		
		// Write a method that returns a boolean value of true or false.
	   // It takes three test scores, and return true or false to indicate
		// if the average grade is a passing grade (i.e., return true if the average is
		// 70.0 points or more).
		
		boolean b = passes(99.0, 83.0, 90.2);
		System.out.println("b is: " + b);
		
		boolean b2 = passes(72.0, 54.5, 69.5);
		System.out.println("return value of: " + b2);
		
		System.out.println( passes(100.0, 5.0, 82.0) );
		
		// Write a method that uses a loop to print the squares of numbers.
		// The squares are reported in increments of one from the first 
		// number to the second number, inclusive:
		
		squares(2, 9);
		squares(100, 105);
		squares(22, 30);
	}
	
	
	// ********* YOU SHOULD WRITE THE OTHER METHODS HERE ********* 
	//Calling string method 
	static void sampleMethod(String s)
	{
		System.out.println("Received: " + s);
	}
	// Report odd number method.
	  static int reportOdd(int num)
   { 
    if ((num % 2)==0)
      System.out.println(num +" is not odd.");
       else 
        System.out.println(num+ " is odd.");
        return num;
    }  
 	
   
   //Area determination method where width is multiplied by hieght
	static double printArea(double width, double hieght)
  {
    double area;
    area= hieght*width;
    System.out.printf("Area is %.1f for a rectangle of width of %.1f and height %.1f.\n",area, width, hieght);
    return area; 
    }
	
  //Stock sale method where the total profit is determined by the number of shares sold and the price per sale. 
	static double stockSale(String bus, double shares, double price)
	
  {
    double totals;
    totals= shares*price;
    System.out.printf("Sold %.0f shares of "+bus+" at $%.2f for $%.2f \n",shares, price, totals);
    return totals; 
    }
	
   
   //Total tax values to determine the amount of taxes for Michigan and California
   static double determineTax(double value, double tax)
   {
    double totalTax;
    totalTax= value*tax;
    return totalTax;
    }
    // Score method that takes the value of the score and determines what grade is achieved given the grade score. 
    static void testScore(int score)
   {
    if (score<=-1|| score>=101)
       System.out.println(score+ " is an invalid score.");
       else
     {  if (score>=90)
          System.out.println( score+ " has a grade of A.");
           else
           { if (score>=80)
              System.out.println(score+ " has a grade of B.");
              else
               {if (score>=70)
                System.out.println(score+ " has a grade of C.");
                 else
                  {if (score>=60)
                   System.out.println(score +" has a grade of D.");
                    else
                     {if (score<=59)
                       System.out.println(score+ " has a grade of E.");
                      }
                   }
                }
             }
           }
        }
    
    
    // This is the dice method using the total of both dice value to determine the outcome of the dice roll. 
 static void firstRoll(int fDice, int sDice)
 {
   int totalDice = (fDice+sDice);
    if (totalDice==7 || totalDice==11)
      System.out.println(fDice+ " and "+sDice+": win!");
       else if (totalDice==2 || totalDice==3 || totalDice==12)
        System.out.println (fDice+ " and " + sDice + ": crap out");
         else 
        System.out.println (fDice+ " and " + sDice +": keep rolling");
   }
    // Water state method which tests the temperature of the given amount to the correct state of being.
       static String waterState(double temp)
   {
      String state="";
      if (temp <= 32)
      {
         state="solid";
      }
      else if (temp < 212)
      {
         state= "liquid";
      }else
      {
         state = "gas";
      }
        return state;   
   }
    
    
    // Boolean true false quiz score, based on the average of the scores to determine if pass or failed. 
  static boolean passes(double quizScore1, double quizScore2, double quizScore3)
    {
       double averageScore;
       boolean answer;
       averageScore= ((quizScore1+quizScore2+quizScore3)/3);
       
       if (averageScore>=70)
         answer= true;
        else
         answer= false;
          return answer;  
     }    
  // Squaring the value given up to the second value given.    
 static int squares(int valOne, int valTwo)
  {
   int sum=0;
  
   for (int squ = valOne;squ <= valTwo; squ++)
   {
   sum = squ*squ;
   System.out.println(squ+" squared: " +sum);
   }
   return sum;
 } 
    
    
 }//End of class bracket don't delete or go past
        
     
 
   