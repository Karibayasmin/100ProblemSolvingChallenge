/* Problem 16 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-bitset/problem

From HackerRank site, could not copy all the word perfectly, some words are missing here. For better understanding of program, visit the problem link.

Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
The  subsequent lines each contain an operation in one of the following forms:

AND 
OR 
XOR 
FLIP
SET 
In the list above,  is the integer  or , where  denotes  and  denotes .
 is an integer denoting a bit's index in the BitSet corresponding to .

For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

AND 2 1
 is the left operand, and  is the right operand. This operation should assign the result of  to .

Constraints

Output Format

After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.

Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output

0 0
1 0
1 1
1 2
Explanation

Initially: , , , and . At each step, we print the respective number of set bits in  and  as a pair of space-separated integers on a new line.



, 
The number of set bits in  and  is .


Set  to  ().
, .
The number of set bits in  is  and  is .


Flip  from  () to  ().
, .
The number of set bits in  is  and  is .


.
, .
The number of set bits in  is  and  is .

All 
*/
import java.util.*;

public class JavaBitsetHackerRank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int numOfBitset = sc.nextInt(); // how many bit in a set I want to take, here I am taking that number.
        int numOfOp = sc.nextInt(); // And in those bit set how many operation I want to do, that number I am taking here.
        
        BitSet bitset1 = new BitSet(numOfBitset); // Here creating a bitset reference variable. and Initially all the value of this set are zero.
        BitSet bitset2 = new BitSet(numOfBitset); // Here creating another bitset reference variable. and Initially all the value of this set also are zero.
		//That means I have taken 2 bitset here.
        
        for(int i=0; i<numOfOp; i++ ){
            
            String op = sc.next();  // Here I am taking operation name
            int setOne = sc.nextInt(); // Here I am taking a integer value which will tell me in which set, I will take action.
            int setTwo = sc.nextInt(); // And this one will tell me in that bitset which position will be change according to the operation.
           
            if(op.equals("AND")){ // if "And" is the value of "op" variable then program will enter in this block 
                if(setOne==1) bitset1.and(bitset2); // here value of op = AND, value of setOne=1, value of setTwo=2 means the AND operation between the 1st and 2nd set where both was initially 00000 value of numOfBitset variable .
                else bitset2.and(bitset1); // program will enter in this block if value of setOne is 2 and value of setTwo is 1 comes.
				
            }else if(op.equals("OR")){  
               if(setOne==1) bitset1.or(bitset2); // here value of op = OR,  setOne=1 setTwo=2 means the OR operation between the 1st and 2nd set where both was initially 00000 value of numOfBitset variable according to the given input.
                else bitset2.or(bitset1);
				
            }else if(op.equals("XOR")){ 
                if(setOne==1) bitset1.xor(bitset2);// here value of op = XOR, setOne=1 setTwo2 means the XOR operation between the 1st and 2nd set where both was initially 00000 value of numOfBitset variable .
                else bitset2.xor(bitset1);
				
            }else if(op.equals("FLIP")){ //here value of op=FLIP, setOne=2 setTwo=2 means to revert the 2nd bit of 2nd set(if it's 0 make it 1,if it's 1 make it 0)
                if(setOne==1) bitset1.flip(setTwo);
                else bitset2.flip(setTwo);
				
            }else if(op.equals("SET")){ //here value of op =SET setOne=1 setTwo=4 means to change the 4th bit of 1st set from 0 to 1,if it's already 1 then do nothing.
               if(setOne==1) bitset1.set(setTwo);
                else bitset2.set(setTwo);
            }
           // System.out.println(b1.cardinality()+" "+b2.cardinality());
            
            System.out.println(bitset1.cardinality()+" "+bitset2.cardinality()); //cardinality() methods of BitSet class Returns the number of bits set to true in this BitSet.
        }
       //System.out.println(bitset1.cardinality()+" "+bitset2.cardinality());
    }
}
