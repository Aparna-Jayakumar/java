import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Q17{
    public static void main(String[] args) {
     System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :27/06/2023");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
System.out.println("-----------OUTPUT---------");
        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}

