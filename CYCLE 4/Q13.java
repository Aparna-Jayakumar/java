import java.util.PriorityQueue;

public class Q13 {
    public static void main(String[] args) {
   System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :23/06/2023");
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
