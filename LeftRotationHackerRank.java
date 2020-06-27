/* Problem 18 #100ProblemSolvingChallenge

   Problem Link: https://www.hackerrank.com/challenges/array-left-rotation/problem

A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of n (the number of integers) and d (the number of left rotations you must perform).
The second line contains n space-separated integers describing the respective elements of the array's initial state.

Constraints

1 <= n <= 10^5
1 <= n <= d
1 <= a[i] <= 10^6

Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform d = 4 left rotations, the array undergoes the following sequence of changes:
                [1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4, 5, 1, 2, 3] -> [5,1,2,3,4]
Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotationHackerRank{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
       // System.out.println("n: "+ n);

        int d = Integer.parseInt(nd[1]);
       // System.out.println("d: "+ d);

        int[] a = new int[n];
        int[] b = new int[n];

       for( i = 0; i < n; i++){
           
           a[i] = scanner.nextInt();
            
       }
             
             for( i = 0; i < n; i++){
                 
               b[(i+n-d)%n] = a[i];

              
              
             //  System.out.println(" (i+n-d)%n = "+(i+n-d)%n + " b[(i+n-d)%n] =" + b[(i+n-d)%n]);
             
             }
             for( i = 0; i < n; i++) {
             //  System.out.print("i = "+i+" = " +b[i]+" ");
               System.out.print(b[i]+" ");
             } 
        
    }
    
}
