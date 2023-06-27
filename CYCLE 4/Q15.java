
import java.util.LinkedHashSet;
import java.util.Set;

public class Q15 {
  System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :27/06/2023");
public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Adding a duplicate element
      
System.out.println("-----------OUTPUT---------");
        System.out.println("Set elements: " + set);
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);
        boolean removedOrange = set.remove("Orange");
        System.out.println("Removed 'Orange'? " + removedOrange);
        System.out.println("Set after removal: " + set);
}
}
