/*Problem 9 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/phone-book/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.




Output Format

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933

*/
import java.util.*;
public class JavaMapHackerRank {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         HashMap<String, Integer> phonebook = new HashMap<>();
        
        int n = sc.nextInt(); //nextInt() only looks at the next integer, it will not move if the next input is not integer.
        sc.nextLine(); // Because next input we will take a String value.
        
        for(int i = 0; i < n; i++){
            
            String name = sc.nextLine(); // It takes full line, nextLine() whether next() takes one word at a time.
            int number = sc.nextInt(); //nextInt() only looks at the next integer, it will not move if the next input is not integer.
            sc.nextLine(); // Because next input we will take a String Value.
            
            /*
              using nextLine() will look up for the rest of the line which is " " until 
              it reaches the end of line and will stop before new line separator
              so using nextLine() after nextInt to ensure that the 2nd nextLine() is correctly captured.
             */
            
            phonebook.put(name, number);
        }
        
      //  System.out.println(phonebook);
        
        while(sc.hasNext()){ ////as long as your something there it's going to continue
            
            String s = sc.nextLine();
            if(phonebook.containsKey(s)){ // The method containsKey() returns boolean true if the presence of the key is detected else false .
                
                System.out.println(s+"="+phonebook.get(s)); //The method get() returns the value associated with the key_element in the parameter.
            }else{
                System.out.println("Not found");
            }
        }
              
      }
         
    }
