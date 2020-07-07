/* Problem 20 #100ProblemSolvingChallenge

   Problem Link: https://www.hackerrank.com/challenges/insertionsort2/problem

In Insertion Sort Part 1, you inserted one element into an array at its correct sorted position. Using the same approach repeatedly, can you sort an entire array?

Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an array with just the first element, it is already sorted since there's nothing to compare it to.

In this challenge, print the array after each iteration of the insertion sort, i.e., whenever the next element has been inserted at its correct position. Since the array composed of just the first element is already sorted, begin printing after placing the second element.

For example, there are n = 7 elements in arr= [3,4,7,5,6,2,1]. Working from left to right, we get the following output:

3 4 7 5 6 2 1
3 4 7 5 6 2 1
3 4 5 7 6 2 1
3 4 5 6 7 2 1
2 3 4 5 6 7 1
1 2 3 4 5 6 7
Function Description

Complete the insertionSort2 function in the editor below. At each iteration, it should print the array as space-separated integers on a separate line.

insertionSort2 has the following parameter(s):

n: an integer representing the length of the array arr
arr: an array of integers
Input Format

The first line contains an integer, n, the size of arr.
The next line contains n space-separated integers arr[i].

Constraints
1 <= n <= 1000
-10000 <= arr[i] <= 10000, 0 <= i < n


Output Format

On each line, output the entire array at every iteration.

Sample Input

6
1 4 3 5 6 2
Sample Output

1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 
Explanation

Skip testing 1 against itself at position 0. It is sorted.
Test position 1 against position 0:4 > 1 , no more to check, no change.
Print arr
Test position 2 against positions 1 and 0:

 3 < 4, new position may be 1. Keep checking.
 3 > 1, so insert 3 at position 1 and move others to the right.
Print arr
Test position 3 against positions 2,1,0 (as necessary): no change.
Print arr
Test position 4 against positions 3,2,1,0: no change.
Print arr
Test position 5 against positions 4,3,2,1,0, insert 2 at position 1 and move others to the right.
Print arr
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        int m = 0; // here value of m is 0.
        //int k = 0;
        for(int i = 0; i < n; i++){ // if condition fullfilled then enter this block
            
             m++; // each time if it can enter in this loop it will increase 1
             int b = arr[m-1]; /* whatever value of m will be from that m I will minus 1 and in this position which value 
			 is presented in the array, that value we are storing here inside b. because inside the next loop value arr[m-1] 
			 can be changed but here only change when first loop enter this block. */
             
           for (int j = m-1; j >= 0; j--){
               
               // System.out.println("m: "+ m + " arr[m-1]: " + arr[m-1]);
               // System.out.println("arr[j]: "+arr[j]);
                
                 if (arr[j] > b){ /* arr[j] inside this array whiever values are coming every value will be checked here.
				 if any value is greater than b then enter this block. */
                     
                     int a = arr[j]; // at first we are storing here current arr[j] value. 
                     arr[j+1] = a; // here arr[j+1] in this positin which value is present we are replacing that with a.
                     arr[j] = b; // now here inside arr[j] in this positin which value is present we are replacing that with b.
                    // print(arr);
                 } 
                 
                 
            }
            if(i != 0){ /* here we are skipping print array for first position. Because it is already sorted as we don't 
			need to compare it with it's itself. */
                
                print(arr); // Inside this we are printing our updated array every time after checking 
                continue;
            }
                
            
            
          //  System.out.println(" ");
        }
         
    }
    
    static void print(int a[]){ 
       for(int i:a)
       System.out.print(i+" ");
       System.out.println();
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            
          //  System.out.println(arr[i]);
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
