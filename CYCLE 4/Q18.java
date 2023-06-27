
import java.util.HashMap;
import java.util.Map;

public class Q18{
    public static void main(String[] args) {
     System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :27/06/2023");
              Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);
        System.out.println("\n NAME : JOM BINOY \n REG NO :SJC22MCA-2033 \n DATE : 23-06-2023 \n COURSE CODE : 20MCA132\n COURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Initial Map: " + map);
        map.put("Alice", 32);
        System.out.println("Map after changing an element: " + map);
        map.remove("Bob");
        System.out.println("Map after removing an element: " + map);
}
}
