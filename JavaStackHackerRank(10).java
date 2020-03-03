/* Problem 10 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-stack/problem

In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true */

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);   
           
        while(sc.hasNext()){
            /*This means that the while loop which you add will wait until you write something.
        After you write something, it will be read and it will continue on. 
        When you fill all the data it will wait again to write something and basically loop for ever.*/     
            boolean valid = true;    
             String value = sc.next(); // Here taken string type value 
        Stack<String> STACK = new Stack<String>(); /* Here Stack is String type data type */  
               
            for(int i = 0; i < value.length(); i++){     
             if(value.charAt(i) == '(' || value.charAt(i) == '{' || value.charAt(i) == '['){    
                 STACK.push(String.valueOf(value.charAt(i)));
                // System.out.println("push = "+value.charAt(i));   
             }else{
                 try{  
                String top = STACK.pop();  
               // System.out.println("top = "+top);
               // System.out.println("ch = "+value.charAt(i));  
                
                if((top == "(" && value.charAt(i) !=  ')') || (top == "{" && value.charAt(i) !=  '}') || (top == "[" && value.charAt(i) != ']')){    
                   valid = false; 
                   
                }else if(STACK.isEmpty()){
                     STACK.clear();
                }
                else{  
                   valid = true;
                }
                }catch(Exception E){     
                    valid = false;
                 }
             }    
            }        
            if(valid && STACK.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }            
        }       
    }    
}
