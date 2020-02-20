/* Problem 2 #100ProblemSolvingChallenge

ProblemLink: https://www.hackerrank.com/challenges/2d-array/problem?h_r=profile

Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following  hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
Our highest hourglass value is  from the hourglass:

0 4 3
  1
8 6 6
Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

arr: an array of integers
Input Format

Each of the  lines of inputs  contains  space-separated integers .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

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

 contains the following hourglasses:

image

The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4 */

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