import java.util.Scanner;
class Sports{
    String sport;
    int Rating;
    Sports(String spo, int ra){
        sport = spo;
        Rating = ra;
    }

}
class Student extends Sports{
    String Grade;
    double Overall_per;
    Student(String spo, int ra,String gd, double per ){
        super(spo, ra);
        Grade = gd;
        Overall_per = per;
    }
}
public class Result extends Student {
    Result(String spo, int ra,String gd, double per ){
        super(spo, ra, gd, per);
    }
    void display(){
        System.out.println("\nSports Details of Student");
        System.out.println("Sport :"+sport);
        System.out.println("Rating :"+Rating);
        System.out.println("\nAcademic Details of Student");
        System.out.println("Academic Grade :"+Grade);
        System.out.println("Overall percentage :"+Overall_per);
    }
    
    public static void main(String[] args) {
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("Date       :07/06/2023");
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter the Sports Details of Student");
        System.out.println("\n Sport: ");
        String a =sc.next();
        System.out.println("\n Sport Rating  out of 10: ");
        int b =sc.nextInt();
        System.out.println("\nEnter the Sports Details of Student");
        System.out.println("\n Academic Grade: ");
        String c =sc.next();
        System.out.println("\n Overall percentage: ");
        double d =sc.nextDouble();
        sc.close();
        Result obj= new Result(a,b,c,d);
        obj.display();
    }
}
