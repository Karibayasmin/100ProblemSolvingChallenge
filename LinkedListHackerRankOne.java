/* Problem 22 #100ProblemSolvingChallenge

   Problem Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
   
This challenge is part of a MyCodeSchool tutorial track and is accompanied by a video lesson.

If you're new to linked lists, this is a great exercise for learning about them. Given a pointer to the head node of a linked list, print its elements in order, one element per line. If the head pointer is null (indicating the list is empty), don’t print anything.

Input Format

The first line of input contains n, the number of elements in the linked list.
The next n lines contain one element each, which are the elements of the linked list.

Note: Do not read any input from stdin/console. Complete the printLinkedList function in the editor below.

Constraints
1 <= n <= 1000
1 <= list(i) <= 1000, where list(i) is the ith element of the linked list.
Output Format

Print the integer data for each element of the linked list to stdout/console (e.g.: using printf, cout, etc.). There should be one element per line.

Sample Input

2
16
13
Sample Output

16
13
Explanation

There are two elements in the linked list. They are represented as 16 -> 13 -> NULL. So, the printLinkedList function should print 16 and 13 each in a new line.

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data; // created a variable but didn't assigned.
        public SinglyLinkedListNode next; // created a object but didn't assigned.

        public SinglyLinkedListNode(int nodeData) { /* This is an parameterized constructor. I have sent data here
		from insertNode method. */
		
            this.data = nodeData; /* what input value is coming from main method to insertNode method to SinglyLinkedListNode
			constructor, that input value is assigned here inside this.data variable. */
            this.next = null; /* inside this.next object is assigned with null. If I don't assign still by default
			it will be null.*/
        }
    }

    static class SinglyLinkedList { 
        public SinglyLinkedListNode head; // Inside SinglyLinkedList class, head object of SinglyLinkedListNode is created.
        public SinglyLinkedListNode tail; // tail object of SinglyLinkedListNode is created.

        public SinglyLinkedList() {
            this.head = null; // Here inside constructor of SinglyLinkedList class this.head assigned with null.
            this.tail = null; // this.tail assigned with null.
        }

        public void insertNode(int nodeData) { // Here I have sent input value as parameter from main method, class.
            
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData); /* node is a reference variable of 
			SinglyLinkedListNode class. and here nodeData is a parameter which I am sending to constractor of 
			SinglyLinkedListNode class. So now here I am going to the constractor of SinglyLinkedListNode class */

            if (this.head == null) {
                this.head = node;
              //  System.out.println("this.head: "+this.head);
                
            } else {
                this.tail.next = node;
              //  System.out.println("this.tail.next: "+this.tail.next);
            }

            this.tail = node;
           // System.out.println("this.tail: "+this.tail);
        }
    }

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) { /* here in this method we have send from main method class 
	a head which value currently is null*/
        
        SinglyLinkedListNode n = head; // an object of SinglyLinkedListNode type here n. and inside n I have assigned head;
		
      //  System.out.println("n: "+ n);
        while(n.next != null){ // if this condition satisfied enter the while block
            
          //  System.out.println("n.next: "+ n.next);
            System.out.println(n.data); // print the data. 
            n = n.next; // increse n.
        }
        System.out.println(n.data); // if it breaks the while block then print the data.
		
		/* and where did I get data and next variable. Well they are present inside SinglyLinkedListNode class. and we 
		 can access them through n.*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList(); // Here I have created a reference variable of SinglyLinkedList class.

        int llistCount = scanner.nextInt(); //inside llistCount I am taking a integer type input from user
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) { 
            int llistItem = scanner.nextInt(); /* here inside llistItem I am taking input from user till i is less than 
			llistCount condion fulfilled. */
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem); /* here llist is the reference variable of SinglyLinkedList class.
			insertNode is a method which is inside  SinglyLinkedList class. and as parameter llistItem 
			I am sending to this insertNode method now. So now from here I am going to insertNode method.*/
        }

		
        printLinkedList(llist.head); /*  After completing for loop block, Here I am calling  printLinkedList Method 
		with (llist.head) this parameter. llist is the reference variable of SinglyLinkedList class and head
        is present inside the SinglyLinkedList class. and what is inside head, to see that go inside SinglyLinkedList class
		and check. So now from here I am going to printLinkedList method.*/

        scanner.close();
    }
}
