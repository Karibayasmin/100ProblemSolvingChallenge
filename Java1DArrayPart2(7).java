/*Problem 7 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-1d-array/problem

Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Given  and , complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).

Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls).
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
Constraints

It is guaranteed that the value of  is always .
Output Format

Return true if you can win the game; otherwise, return false.

Sample Input

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

We perform the following  queries:

For  and , we can walk and/or jump to the end of the array because every cell contains a . Because we can win, we return true.
For  and , we can walk to index  and then jump  units to the end of the array. Because we can win, we return true.
For  and , there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For  and , there is no way for us to get past the one at index . Because we cannot win, we return false.
*/

import java.util.*;
public class Java1DArrayPart2 {
    
/*Here's a test case from the problem:

6 5
0 0 0 1 1 1
Our array is of size 6, our step size m = 5, and the array is shown above.

We start at index 0.

First, it tries to take a step of size 5, and fails (since there's a 1 there). Then it tries taking a step forward "i+1", and it works (since there's a 0 there). So now we're at index 1 in the array.

Now it can take a leap of size m = 5, and succeed.*/
    
    public static boolean canwin(int leap, int [] game, int i){
        
      
        //Base case
        if( i < 0 || game[i] == 1) return false; // if inside i value is less than 0 means minus value or if inside game[i]  value is 1 then it will return false. 
       
        if( (i == game.length - 1) || i+leap > game.length-1 ) return true; // if i means index position and array last index position are same or i+leap position cross the array last index position limit then true.
        
        game[i] = 1; //mark each array value as 1 when visiting it.
        /*to mark the cells you already evaluated, you should do that before calling the recursion, 
        otherwise you will infinitely looping through already visited cells.*/
        
         
         // Recursive Cases
        return canwin(leap, game, i+1) || canwin(leap, game, i-1) || canwin(leap, game, i+leap);
        /*The function is called with all the 3 options (i+1, i-1, i+m). 
        Since this is an OR operation you can return TRUE if any 1, 2 or 3 calls return TRUE.*/
        

    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
    //    System.out.println("Enter the number of q : ");
        int q = sc.nextInt();
    //    System.out.println("Enter the number of n : ");
    
    while(q-- > 0){   // the value of i will be decremented, immediately after the condition is checked
        int n = sc.nextInt();
    //    System.out.println("Enter the number of leap: ");
        int leap = sc.nextInt();
        
        int game [] = new int [n];
        for(int i = 0; i < n; i++){
            
            game[i] = sc.nextInt();
          
        }
        
        
       // System.out.println("After the condition calculating return result " + (canwin(leap, game, 0) ? "Yes" : "No"));
         System.out.println( canwin(leap, game, 0) ? "YES" : "NO"); // booleanCondition ? executeThisPartIfBooleanConditionIsTrue : executeThisPartIfBooleanConditionIsFalse
         
    }
     
    }
}