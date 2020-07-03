/*
Sorting
One common task for computers is to sort data. For example, people might want to see all their files on a computer sorted by size. Since sorting is a simple problem with many different possible solutions, it is often used to introduce the study of algorithms.

Insertion Sort
These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. We will first start with a nearly sorted list.

Insert element into sorted list
Given a sorted list with an unsorted number e in the rightmost cell, can you write some simple code to insert e into the array so that it remains sorted?

Since this is a learning exercise, it won't be the most efficient way of performing the insertion. It will instead demonstrate the brute-force method in detail.

Assume you are given the array arr = [1, 2, 4, 5, 3] indexed 0....4. Store the value of arr[4]. Now test lower index values successively from 3 to 0 until you reach a value that is lower than arr[4], arr[1] in this case. Each time your test fails, copy the value at the lower index to the current index and print your array. When the next lower indexed value is smaller than arr[4], insert the stored value at the current index and print the entire array.

The results of operations on the example array is:

Starting array: [1, 2, 4, 5, 3]
Store the value of arr[4] = 3 Do the tests and print interim results:

1 2 4 5 5
1 2 4 4 5
1 2 3 4 5
Function Description

Complete the insertionSort1 function in the editor below. It should print the interim and final arrays, each on a new line.

insertionSort1 has the following parameter(s):

n: an integer, the size of arr.
arr: an array of integers to sort
Input Format

The first line contains the integer n, the size of the array arr.
The next line contains n space-separated integers arr[0]....arr[n-1].

Constraints

1 <= n <= 1000
-10000 <= arr[i] <= 10000

Output Format

Print the array as a row of space-separated integers each time there is a shift or insertion.

Sample Input

5
2 4 6 8 3
Sample Output

2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 
Explanation

3 is removed from the end of the array.
In the 1st line 8>3, so 8 is shifted one cell to the right.
In the 2nd line 6>3, so 6 is shifted one cell to the right.
In the 3rd line 4>3, so 4 is shifted one cell to the right.
In the 4th line 2>3, so 3 is placed at position 1.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSortPart1 {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
             int a = arr[n-1]; // Here arr[n-1] means last position value.
             for(int i = n-2; i >= 0; i--){ // Here for loop started from n-2 number position and ended when i = 0.
                // System.out.println(i+" (n-2)/arr[i] no. position: "+ arr[i]);
                 
                 if(arr[i]> a){ /* Here with last position value, 
				 I am comparing all the value which I am getting from for loop. 
				 And if last position value is smaller than the value then enter the block */
                     arr[i+1] = arr[i]; // copy that value and put that copied value in the next position also.
                     for(int j = 0; j < n; j++){ // And print this stage, with the help of this value
                        // System.out.println(j+" = "+ arr[j]);
                        System.out.print(arr[j]+ " ");
                     }
                     System.out.println(" ");
                     
                 }else if(arr[i] < a){ /* Here also with last position value, 
				 I am comparing all the value which I am getting from for loop. 
				 And if last position value is bigger than the value then enter the block */
                     arr[i+1] = a; // In the next position value I am putting my last position value.
                     for(int j = 0; j < n; j++){  // And print this stage, with the help of this value
                        // System.out.println(j+ " = " +arr[j]);
                        System.out.print(arr[j]+ " ");
                     }
                     break; // As I have inserted in the exact right position, my last position value. So I am breaking this block here.
                    
                 }
                 if(i == 0){ /* if still my last position value could not inserted in the right positon according to the condition.
				 Then I can surely say that when i == 0, last position value will insert here*/
                     arr[i]=a;
                    // System.out.println(i+ " = " +arr[i]+ " = "+ a);
                     for(int j = 0; j < n; j++){
                        // System.out.print(j+ " = " +arr[j]);
                        System.out.print(arr[j] +" ");
                     }
                     System.out.println(" ");
                 }
             }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
           // System.out.println("i = "+ i +" arrItem: "+ arrItem);
            arr[i] = arrItem;
           // System.out.println("i = "+ i +" arr[i] "+ arr[i]);
        }

        insertionSort1(n, arr);

    //    scanner.close();
    }
}
