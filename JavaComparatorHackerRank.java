/* Problem 13 #100ProblemSolvingChallenge
   
   Problem Link: https://www.hackerrank.com/challenges/java-comparator/problem
   
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.

Given an array of n Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer, n, denoting the number of players.
Each of the n subsequent lines contains a player's name and score, respectively.

Constraints

0<= score <= 1000
2 players can have the same name.
Player names consist of lowercase English letters.
Output Format

You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/

import java.util.*;

class Checker implements Comparator<Player>{ // Inside this <> bracket Player class uses as a generic so that we can work with the values of Player class.
    @Override //1. We use @Override when every time we override a method.
              //2. we can use @Override for a method implementing an interface.
    
    public int compare(Player p1,Player p2)
    {
        if(p1.score==p2.score){
           return p1.name.compareTo(p2.name); //alphabetically means a-z order
        }
        else if(p1.score<p2.score){ // if this condition satisfy, it will return 1 means swap.
            return 1;
        }
        else{
            return -1; // if this condition satisfy, it will return -1 means no swap.
        }
        
    }
        
        /*Java does nothing on the ording when it sees a negative number be return. 
        It only flip order when it sees a positive number*/
}

class Player{ // Inside this class all values are initialized which used inside Checker class.
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparatorHackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker(); // create an reference object of Checker class
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt()); // Here taking value from user
        }
        scan.close();
     
        Arrays.sort(player, checker); // This call specifies to sort the array by using the sort logic in Checker class
		
		/* Arrays.sort works for arrays which can be of primitive data type also. 
		Collections.sort() works for objects Collections like ArrayList, LinkedList, etc */
        
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);// sorted value is printed here.
        }
    }
}