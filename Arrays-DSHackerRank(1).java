/*Problem 1 #100ProblemSolvingChallenge

ProblemLink: https://www.hackerrank.com/challenges/arrays-ds/problem?h_r=profile

An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).

Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,  (the number of integers in ).
The second line contains  space-separated integers describing .

Constraints

Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input 1

CopyDownload
Array: arr
1
4
3
2

 
4
1 4 3 2
Sample Output 1

2 3 4 1 */



import java.util.Scanner;   // import the Scanner Package here.
public class Arrays-DSHackerRank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // created a reference variable 'sc' of Scanner class so that I can take input from user. 
     // System.out.println("Enter the number of n: ");
      int n = sc.nextInt();   // I have taken here a integer type input from user
      int a[] = new int[n];   // here array index size is  0 to n-1
      
      for(int i = 0; i < n; i++){ /* If I use here <= then it will show me Array index out of bound exception because  
	                              If a request for a negative or an index greater than or equal to size of array is made, then the JAVA throws a ArrayIndexOutOfBounds Exception. */
          a[i] = sc.nextInt();       //Here I am taking each array i number positin value from user.
        //  System.out.println(a[i]);
          
      }
      
      for(int j = 0; j < n; j++){  /* here array position a[j] and a[i] are same 0, 1, 2, 3...... that's why whatever value We have taken 
	                               inside the same position a[i] 0,1,2,3... are so showing the same value inside the the same position a[j] 0,1, 2,3.... */
          int x = a[n-1-j];       // here inside x I have calculate that which array position value I want to show. As Example If n = 4 and first time j = 0 then n-1-j = 4-1-0 = 3 So a[3] number position value I am showing here and so on.....
          
           System.out.print(+x+" "); // Here I am showing the value of x and with a side space
          
      }
      System.out.println(); // Here I have given a new line
    }
}