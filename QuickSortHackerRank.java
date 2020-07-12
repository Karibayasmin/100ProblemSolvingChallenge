/* Problem 21 #100ProblemSolvingChallenge

   Problem Link: https://www.hackerrank.com/challenges/quicksort1/problem
   
   The previous challenges covered Insertion Sort, which is a simple and intuitive sorting algorithm with a running time of O(n^2). In these next few challenges, we're covering a divide-and-conquer algorithm called Quicksort (also known as Partition Sort). This challenge is a modified version of the algorithm that only addresses partitioning. It is implemented as follows:

Step 1: Divide
Choose some pivot element, p, and partition your unsorted array, arr, into three smaller arrays: left, right, and equal, where each element in left < p, each element in right > p, and each element in equal = p.

For example: Assume arr = {5, 7, 4, 3, 8}
The pivot is at arr[0] = 5
arr is divided into left = {4, 3}, equal = {5}, and right = {7, 8}.
Putting them all together, you get {4, 3, 5, 7, 8}. Another valid solution is {3, 4, 5, 8, 7}.

Given  arr and p = arr[0], partition arr into left, right, and equal using the Divide instructions above. Then print each element in left followed by each element in equal, followed by each element in right on a single line. Your output should be space-separated and does not have to maintain ordering of the elements within the three categories.

Function Description

Complete the quickSort function in the editor below. It should return an array of integers as described above.

quickSort has the following parameter(s):

arr: an array of integers where arr[0] is the pivot element

Input Format

The first line contains n, the size of the array arr.
The second line contains n space-separated integers describing arr (the unsorted array). The first integer (corresponding to arr[0]) is your pivot element, p.

Constraints

1 <= n <= 1000 
-1000 <= arr[i] <= 1000 where 0 <= i < n
All elements will be unique.
Output Format

On a single line, print the partitioned numbers (i.e.: the elements in left, then the elements in equal, and then the elements in right). Each integer should be separated by a single space.

Sample Input

5
4 5 3 7 2
Sample Output

3 2 4 5 7
Explanation

arr = [4, 5, 3, 7, 2] Pivot:p = arr[0] = 4.
left = {}; equal = {4}; right = {} 

arr[1] = 5 > p, so it's added to right.
left = {}; equal = {4}; right = {5} 

arr[2] = 3 < p, so it's added to left.
left = {3}; equal = {4}; right = {5} 

arr[3] = 7 > p, so it's added to right.
left = {3}; equal = {4}; right = {5,7} 

arr[4] = 2 < p, so it's added to left.
left = {3,2}; equal = {4}; right = {5,7} 

We then print the elements of left, followed by equal, followed by right, we get: 3 2 4 5 7.

You don't need to maintain ordering, so another valid solution would be 2 3 4 5 7.

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QuickSortHackerRank{

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        
        int i = 0;
        int length = arr.length; // As only array has passed from main method, So I need the length and obviously lenth will be that array's length, which array's value I want here.
        int m = arr[i]; // its pivot value.
		
        for(i = 0; i < length; i++){
            
            // System.out.println("m: "+ m);
            // System.out.println("arr[i]: "+ arr[i]);
             
               if(m > arr[i]){ // if m is greater than arr[i], enter the block
                 for(int j=i;j>0;j--){ /* which i position value was less than m, that i position number is the value of j, 
				 and it will check untill it is greater than 0.*/
                    int temp=arr[j]; // inside temp, first i am storing the current arr[j] value.
                    arr[j]=arr[j-1]; // then inside arr[j] I am replacing value with arr[j-1];
                    arr[j-1]=temp; // Now inside arr[j-1], I am replacing value with temp.
                 }
               }
        }
         return arr; // here I get my updated arr and return it to main method.
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
          //  System.out.print(arr[i]);
        }
        System.out.println(" ");
        
        int[] result = quickSort(arr); // From here passing arr to static quickSort method to calculate the array

        for (int i = 0; i < result.length; i++) { // here printing the result.
           System.out.print(result[i]);

            if (i != result.length - 1) { // this is nothing but a space giving.
               System.out.print(" ");
            }
        }

    }
}
