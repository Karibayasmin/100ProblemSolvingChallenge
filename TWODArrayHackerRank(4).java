/* Problem 4 #100ProblemSolvingChallenge

ProblemLink: https://www.hackerrank.com/challenges/java-2d-array/problem

You are given a 6 * 6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4
*/
import java.util.Scanner;               // here imported Java Scanner Class
public class TWODArrayDSHackerRank {    /* Here I have given the class name "TWODArrayDSHackerRank" but 
                                        if you want, you can try "2DArrayDSHackerRank" this name, 
										And you will get Compillation Error because this breaks the rules of Java Class Name. */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // created a reference variable 'sc' of Scanner class so that I can take input from user. 
       int n = sc.nextInt();
     int a[][] = new int[n][n];
     
     for(int i = 0; i < n; i++){
         
         for(int j = 0; j < n; j++){
           //  System.out.print(i+","+j+" = ");
             a[i][j] = sc.nextInt();               //Here I am taking each array i number & j umber positin value from user.
            // System.out.print(a[i][j]);
             
         }
       //  System.out.println();
     }
      int maxsum = Integer.MIN_VALUE;             /* My output addition value could be minus also, Now in this line this is the max value, 
	                                              but when I will get greater than this value at the end, that time I will replace the 
												  value inside maxsum. */
   //   System.out.println(maxsum);
     for(int row = 0; row < (n-2); row++){            /* In this nested for loop, We did not use n, we used (n-2) because it will calculate (n-2) times Everytime.
	 
	                                                  try to understand carefully
	 
                                                      1 1 1 0 0 0
                                                      0 1 0 0 0 0
                                                      1 1 1 0 0 0
                                                      0 0 2 4 4 0
                                                      0 0 0 2 0 0
                                                      0 0 1 2 4 0

                                                      1st time will calculate = 1 1 1,  2nd time = 1 1 0, 3rd time = 1 0 0, 4th time = 0 0 0
	                                              */
         
         for(int col = 0; col < (n-2); col++){
             
             /*System.out.print(row+","+col+" = "+a[row][col]+"+"+a[row][col+1]+"+"+a[row][col+2]+"+"+
                                              a[row+1][col+1]+"+"+
                             a[row+2][col]+"+"+a[row+2][col+1]+"+"+a[row+2][col+2]+" = "
                             +(a[row][col]
                             +a[row][col+1]
                             +a[row][col+2]
                             +a[row+1][col+1]
                             +a[row+2][col]
                             +a[row+2][col+1]
                             +a[row+2][col+2])
                             +" ");*/
                            int sum = a[row][col]
                             +a[row][col+1]
                             +a[row][col+2]
                             +a[row+1][col+1]
                             +a[row+2][col]
                             +a[row+2][col+1]
                             +a[row+2][col+2];
                             
                         //    System.out.println("sum = "+sum);
                             
                             if(sum > maxsum){    // Here I have compared value inside sum with value inside maxsum, is sum greater than maxvalue or not.
                                 maxsum = sum;    // If the condition is satisfied I have updated the value inside maxsum                          
                            //     System.out.println("maxsum = "+maxsum);
                             }
                             
         }
        // System.out.println();
     }
     System.out.println(maxsum);    // At the end printed the  largest (maximum) hourglass sum.
     
      
    }
}