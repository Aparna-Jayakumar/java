import java.util.*;
class Q14
{
public static void main(String[] args)
{
  System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :27/06/2023");
Deque<String> deque = new LinkedList<String>();
deque.add("Java");
deque.addFirst("Python");
deque.addLast("Datastructure");
deque.push("Web-programming");
deque.offer("Networking");
deque.offerFirst("DBMS");
System.out.println("-----------OUTPUT---------");
System.out.println(deque + "\n");
deque.removeFirst();
deque.removeLast();
System.out.println("Deque after removing " + "first and last: " + deque);
}
}

