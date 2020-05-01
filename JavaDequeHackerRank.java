/* Problem 15 #100ProblemSolvingChallenge
    
   Problem Link: https://www.hackerrank.com/challenges/java-dequeue/problem

In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.

Note: Time limit is 3 second for this problem.

Input Format

The first line of input contains two integers N and M: representing the total number of integers and the size of the subarray, respectively. The next line contains N space separated integers.

Constraints

1 <= N <= 100000
1 <= M <= 100000
M <= N
The numbers in the array will range between [0, 10000000] .

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size M.

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

s1 = (5,3,5) - Has 2 unique numbers.

s2 = (3,5,2) - Has 3 unique numbers.

s3 = (5,2,3) - Has 3 unique numbers.

s4 = (2,3,2) - Has 2 unique numbers.

In these subarrays, there are 2,3,3,2 unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is 3.
*/
import java.util.*;
    
public class JavaDequeHackerRank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>(); // Deque can add or remove both side of a set
        HashSet<Integer> set = new HashSet<>();    // Hashset used because this counts only unique values of data type which will help us to count unique values of our set.

        int n = in.nextInt(); // We have taken a number here how many value we want in our set.
        int m = in.nextInt(); // subarray number we are taking here.
        int max = Integer.MIN_VALUE; // At the very first time we initialized that maximum unique number in our set is Minimum integer value.

        for (int i = 0; i < n; i++) {
            int input = in.nextInt(); // inside this we are entering value of our set

            deque.add(input); // inside deque we are adding value. And here all the similar and unique value are presented what we have entered.
            set.add(input); // inside set also we are adding value. And here what we have entered among them, only unique value are presented .

            if(deque.size() == m){ // when the number of m and size of deque will be same will enter in this if block
                if(set.size() > max) max = set.size(); // when size of hashset value will be greater then present value of max. we will update the value of x.
                int first = deque.remove(); //here an variable first initialized with a removed value. this value is removed from front side of our set and store it inside first variable.
                if(!deque.contains(first)) set.remove(first);    
				/*
				If the first element is found twice in a deque subarray, you don't need to do anything to the set, 
				since duplicates would not exist in the set, and it is already reduced when a duplicate entry is overwritten in the set.
                However, if the 'first' isn't found in a deque subarray twice, 
				you know that a duplicate entry for this value has not been overwritten in the set, and the set size may need to be reduced.
				*/
            }
        }
        System.out.println(max);
    }
}