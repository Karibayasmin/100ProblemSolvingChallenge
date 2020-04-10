/* Problem 12 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-generics/problem

Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World
Do not use method overloading because your answer will not be accepted.

*/
import java.io.IOException;
import java.lang.reflect.Method;

class Printer<T> // Generics type, thats why T used inside <> this.
{
   //Write your code here
   public void printArray(T[] a){   // Type value will be in the array

       for(int i = 0; i < a.length; i++){
           System.out.println(a[i]);
       }
   }
 
}

public class GenericsHackerRank{


    public static void main( String args[] ) {
        Printer myPrinter = new Printer(); // Reference object  of Printer class has creted here
        Integer[] intArray = { 1, 2, 3 };     // Integer type Array. Integer full name used or Integer class name because of Generics
        String[] stringArray = {"Hello", "World"};  // String Type Array
        myPrinter.printArray(intArray);  // Reference object  of Printer class is accessing the printArray method and passing integer type array value
        myPrinter.printArray(stringArray);// and here passing String type array value 
        int count = 0; // here count is at first 0

        for (Method method : Printer.class.getDeclaredMethods()) {   // From here method overloading happening or not this is checking. if same method name call from the main class it will increase the count vaue. if counts value become greater than 1 it will confirm that method overloading happens.
            String name = method.getName();

            if(name.equals("printArray"))   
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}