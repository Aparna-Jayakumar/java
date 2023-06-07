import java.util.Scanner;
public class String_m{
    public static void main(String[] args) {
     System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("Date       :05/06/2023");
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(1));
        System.out.println("String Contains 'Col' sequence :"+str1.contains("Col"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'col' with 'kol' : "+str1.replaceAll("Col","kol"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
