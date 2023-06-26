import  java.util.*;
public class Q12 {
    public static void main(String[] args) {
   System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :23/06/2023");
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(67);
        st.push(89);
        st.push(23);
        System.out.println("Stack = "+st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position : ");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}
