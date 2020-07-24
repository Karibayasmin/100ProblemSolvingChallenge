/*Problem 23 #100ProblemSolvingChallenge

  Problem Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem

You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

Input Format

You have to complete the SinglyLinkedListNode insertAtTail(SinglyLinkedListNode head, int data) method. It takes two arguments: the head of the linked list and the integer to insert at tail. You should not read any input from the stdin/console.

The input is handled by code editor and is as follows:
The first line contains an integer n, denoting the elements of the linked list.
The next n lines contain an integer each, denoting the element that needs to be inserted at tail.

Constraints
1 <= n <= 1000
1 <= list(i) <= 1000
 
Output Format

Insert the new node at the tail and just return the head of the updated linked list. Do not print anything to stdout/console.

The output is handled by code in the editor and is as follows:
Print the elements of the linked list from head to tail, each in a new line.

Sample Input

5
141
302
164
530
474
Sample Output

141
302
164
530
474
Explanation

First the linked list is NULL. After inserting 141, the list is 141 -> NULL.
After inserting 302, the list is 141 -> 302 -> NULL.
After inserting 164, the list is 141 -> 302 -> 164 -> NULL.
After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL. After inserting 474, the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, which is the final list.
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
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) { /* From main method data has sent to insertNodeAtTail method, from there 
		if head is null then data has sent here. */
            this.data = nodeData; // that data assigning inside this.data.
            this.next = null; // and inside object next is assigning null. Now go back to method.
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) { // inside node object, head object is comming from main method class.
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next; // here traversing to the next node

            if (node != null) {
                bufferedWriter.write(sep); // printing all the data. By default data added in the tail when we add data.
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
           
        if(head == null) 
            return new SinglyLinkedListNode(data); /* if inside head is null then it will return to constructor of 
		SinglyLinkedListNode, data. So after sending data what will happen inside SinglyLinkedListNode constructor to check 
		visit that constructor. */
        else
            head.next = insertNodeAtTail(head.next, data); /* if head is not null then inside the next memory location means
		inside head.next again insertNodeAtTail assigning with head.next and data parameter.*/
                        
        return head; // only head is returning because inside SinglyLinkedListNode object we have assigned this method.

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList(); // Here llist is the reference variable of SinglyLinkedList class.

        int llistCount = scanner.nextInt(); // here inside llistCount variable I am taking a input value.
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
          
            int llistItem = scanner.nextInt(); /* Here inside llistItem, I am taking taking input value, 
			till i is less than llistCount */
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem); /* Here llist_head is a object of
		  SinglyLinkedListNode class. Inside this object I am assigning insertNodeAtTail method with 2 parameter. 
		  First parameter is llist.head. Here llist is the reference variable of SinglyLinkedList class.
		  and head is present inside SinglyLinkedList class. What is inside head, to check that visit SinglyLinkedList class.
		  Now 2nd parameter is llistItem. What is inside llistItem I have already said. So from here I am going to 
		  insertNodeAtTail method.*/
		  
          llist.head = llist_head; /* Inside llist.head, I am assigning llist_head which is object of SinglyLinkedListNode 
		  class. Inside llist_head has a memory location which is returning from insertNodeAtTail method.*/
          
        }



        printSinglyLinkedList(llist.head, "\n", bufferedWriter); /* After completing For loop block, now here I am calling
		printSinglyLinkedList method with parameter head. So from here I am going to printSinglyLinkedList method*/
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
