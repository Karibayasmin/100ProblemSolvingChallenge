/*Problem 8 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-list/problem?h_r=next-challenge&h_v=zen

For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints



Each element in is a 32-bit integer.
Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
Explanation


 Insert 23 at index .

 Delete the element at index .

Having performed all  queries, we print  as a single line of space-separated integers.

*/

import java.util.*;
public class JavaListHackerRank {
     public static void main (String [] args){
       
       Scanner sc = new Scanner(System.in);
       
     //  System.out.println("Enter the number of n: ");
       int n = sc.nextInt();
       
       ArrayList<Integer> arlist = new ArrayList<>();
       
     //   System.out.println("Enter the values: ");
       for(int i = 0; i < n; i++){
          
           int value = sc.nextInt();
           
           arlist.add(value);
       }
       
      // System.out.println("Arlist = "+ arlist);
       
      // System.out.println("Enter the number of q: ");
       int q = sc.nextInt();
       
       for(int j = 0; j < q; j++){
           
         //  System.out.println("Enter which operation you want to do: ");
           String operation = sc.next();
          if(operation.equals("Insert")){ // Inside operation which string value we have taken if that is same to same "Index" value then it will enter in the if block
           /*
		   == checks if both objects point to the same memory location 
		   whereas .equals() evaluates to the comparison of values in the objects.
		   */
          // System.out.println("Enter the number of index to add value: ");
           int index = sc.nextInt();
         //  System.out.println("Enter the number of value: ");
           int value = sc.nextInt();
           arlist.add(index, value);
          }else{ 
         //  System.out.println("Enter the number of index only for remove: ");
              int index = sc.nextInt();
          
          arlist.remove(index);
              
          }
           
       }
       
       for(int num : arlist){
           
           System.out.print(num+" ");
       }
     
    }
}