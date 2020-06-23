/* Problem 17 #100ProblemSolvingChallenge

Problem Link: https://www.hackerrank.com/challenges/java-priority-queue/problem

In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

In this problem we will test your knowledge on Java Priority Queue.

There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

The Student class should implement:
The constructor Student(int id, String name, double cgpa).
The method int getID() to return the id of the student.
The method String getName() to return the name of the student.
The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.
Input Format

The first line contains an integer, n, describing the total number of events. Each of the n subsequent lines will be of the following two forms:

ENTER name CGPA id: The student to be inserted into the priority queue.
SERVED: The highest priority student in the queue was served.
The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities classes implementation.

Constraints
2 <= n <= 1000
0 <= CGPA <= 4.00
1 <= id <= 10^5
2 <= |name| <=30
Output Format

The locked stub code prints the names of the students yet to be served in the priority order. If there are no such student, then the code prints EMPTY.

Sample Input 0

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Sample Output 0

Dan
Ashley
Shafaet
Maria
Explanation 0

In this case, the number of events is 12. Let the name of the queue be Q.

John is added to Q. So, it contains (John, 3.75, 50).
Mark is added to Q. So, it contains (John, 3.75, 50) and (Mark, 3.8, 24).
Shafaet is added to Q. So, it contains (John, 3.75, 50), (Mark, 3.8, 24), and (Shafaet, 3.7, 35).
Mark is served as he has the highest CGPA. So, Q contains (John, 3.75, 50) and (Shafaet, 3.7, 35).
John is served next as he has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).
Samiha is added to Q. So, it contains (Shafaet, 3.7, 35) and (Samiha, 3.85, 36).
Samiha is served as she has the highest CGPA. So, Q contains (Shafaet, 3.7, 35).
Now, four more students are added to Q. So, it contains (Shafaet, 3.7, 35), (Ashley, 3.9, 42), (Maria, 3.6, 46), (Anik, 3.95, 49), and (Dan, 3.95, 50).
Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order. So, Q contains (Dan, 3.95, 50), (Ashley, 3.9, 42), (Shafaet, 3.7, 35), and (Maria, 3.6, 46).
As all events are completed, the name of each of the remaining students is printed on a new line.
*/

import java.util.*;

 class Checker implements Comparator<Student>{ // Explained before in Comparator Problem Solving.
    
    @Override
    
    public int compare(Student s1, Student s2){
        if(s1.cgpa == s2.cgpa){
            return s1.name.compareTo(s2.name);
        }
        else if(s1.cgpa == s2.cgpa && s1.name == s2.name){
            if(s1.id > s2.id){
                return -1;
            }else{
                return 1;
            }
        }
        else if(s1.cgpa > s2.cgpa){
           return -1;
        }else{
            return 1;
        }
    }
    
}

 class Student{
    
    int id;
    String name;
    double cgpa;
    
    public Student(int id, String name, double cgpa){
        
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCgpa(){
        return cgpa;
    }
}

class Priorities{
    List<Student> getStudents(List<String> events){  /* List<Student> is a datatype of getStudents method and 
	List<String> events is parameter of getStudents method where List<String> is the data type of events. */
        
        PriorityQueue<Student> pq = new PriorityQueue(10,new Checker()); 
		
		/* Here we have used PriorityQueue Constructor which is given in Oracle Java site. Here is the link:
		https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
		Here it is the syntax:
		 PriorityQueue(int initialCapacity, Comparator<? super E> comparator)
		 
Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator.
Here capacity means preparing the queue to be able to store at least X items without requiring additional internal memory allocations.
It is always at least as large as the queue size. As elements are added to a priority queue, its capacity grows automatically.
The details of the growth policy are not specified.
		*/
        


int i=0; // here i is a variable initialized with 0
   while(i < events.size())  { // if i is less than events size then enter in this block.
            if (events.get(i).equals("SERVED")) { /* Inside events list which event is present in 0 number position? 
			is it is equals to SERVED? if it is then enter this block and poll */ 
                pq.poll(); /* The task of poll is Retrieves and removes the head of this queue, or returns null if this queue is empty. 
				and it's from Java 7 */
            } else {
                String[] attributes = events.get(i).split("\\s");
                Student student = new Student(  /* here attributes[3] means here all the id is coming, 
				attribute[2] means all the cgpa is coming attribute[1] means all the names are coming */
				
                        Integer.parseInt(attributes[3]),
                        attributes[1],
                        Double.parseDouble(attributes[2]) 
                );
                pq.offer(student); // Inserts the specified element into this priority queue. and it's from java 7 also.
            }
            i++;
        }


   List<Student> l = new ArrayList<Student>(); // Here updated list is created after the poll and offer operation
   while (!pq.isEmpty()) {
            l.add(pq.poll());
  
   }
    return l;
   

 
    
    }
}




public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());  // taking total event number and a new line  
        List<String> events = new ArrayList<>(); // events list as string
        
        while (totalEvents-- != 0) { // if totalEvents-1 != 0 then enter the while loop block
            String event = scan.nextLine(); // taking a event name
            events.add(event); // entering or adding that event name inside the events list
        }
        
        List<Student> students = priorities.getStudents(events); // class type List and the class name is Student and students is the reference variable of this list.
        
        /*to process all the given events and 
        return all the students yet to be served in the priority order.*/
        
        if (students.isEmpty()) { // if there is no value available in the list then enter this block
            System.out.println("EMPTY");
        } else { //if available then enter this block
            for (Student st: students) { 
                System.out.println(st.getName()); // print the sorted Name according to the priority
            }
        }
    }
}