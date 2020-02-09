/*Day 3, Problem 2 #50DaysAnd100ProblemSolvingChallenge

ProblemLink: https://www.hackerrank.com/challenges/java-arraylist/problem

Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line.

Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Constraints
1 <= n <= 20000
0 <= d <= 50000
1 <= q <= 1000
1 <=x <= n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5 .

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
Explanation

The diagram below explains the queries:

image

*/

import java.util.*;
public class ArrayListDSHackerRank { 
    public static void main( String [] args ) { 
        
    ArrayList<ArrayList<Integer>> row = new ArrayList<ArrayList<Integer>>(); // Here I have declared 2 Dimensional ArrayList (declaration is when you allocate memory for it, initialization is when you give it a first value during declaration.)
   
       Scanner sc = new Scanner(System.in);  // created a reference variable 'sc' of Scanner class so that I can take input from user. 
       
    //   System.out.println("Enter the number of row: ");
         int n = sc.nextInt();                               // here inside n I am taking the number of row position.
       for(int i = 0; i < n; i++){
           
           ArrayList<Integer> col = new ArrayList<Integer>();
           row.add(col);
           
    //   System.out.println("Enter the number of column: ");
    
                                                                  
       int m = sc.nextInt();                                 // here inside m I am taking the number of column position I want in a particular row.
           
           for(int j = 0; j < m; j++){
               
                col.add(sc.nextInt());                      // here inside particular column position I am taking the value.
              
           }
       //    System.out.println();
       }
     //  System.out.println(row);
       
     //  System.out.println("Enter the number of l: ");
       int l = sc.nextInt();                                 // here I am taking a number to know that how many times I want to query.
      
       for(int k = 0; k < l; k++){
           
         //  System.out.println("Enter the number of firstPosition or rowposition : ");
            int fp = sc.nextInt();                                                           // Inside fp I am taking a row position and
         //  System.out.println("Enter the number of secondPosition or column position: ");
            int sp = sc.nextInt();                                                           // Inside sp I am taking a column position 
            
            try{
            int value = row.get(fp-1).get(sp-1);
             System.out.println(value);                                                        // Here Printing the value of that row and column position.
           //  System.out.println(fp+","+sp+" Value = "+value);
           
            }catch(IndexOutOfBoundsException error){
                System.out.println("ERROR!");                                                   // if that position is not exist or have no value then it will print ERROR!
            }
           
       }
    

    }
}
