import java.util.*;

public class Q11 {
    public static  void main(String[] args){
      System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :21/06/2023");
        LinkedList<String> L=new LinkedList<>();
        L.add("JAVA");
        L.add("PYTHON");
        L.add("CSS");
        L.add(0,"PROGRAMING LANGUAGE");
        System.out.println(L);
        L.remove("CSS");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);


    }

}
