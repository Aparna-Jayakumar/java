import java.util.Scanner;
public class Employee {
int empid;
String name;
float salary; 
public void getInput() { 
Scanner in = new Scanner(System.in);
System.out.print("Enter the empid :: ");
empid = in.nextInt();
System.out.print("Enter the name :: ");
name = in.next();
System.out.print("Enter the salary :: ");
salary = in.nextFloat();
} 
public void display() { 
System.out.println("Employee id = " + empid);
System.out.println("Employee name = " + name);
System.out.println("Employee salary = " + salary);
} 
public static void main(String[] args) { 
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("Date       :05/04/2023");
Employee e[] = new Employee[5];  
for(int i=0; i<5; i++) {   
e[i] = new Employee();
e[i].getInput();
}  
System.out.println("**** Data Entered as below ****"); 
for(int i=0; i<5; i++) {  
e[i].display();
}
}
}
