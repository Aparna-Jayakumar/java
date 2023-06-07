import java.util.Scanner;
public class Sort
{
    public static void main(String[] args) 
    {
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("   Date    :11/04/2023");
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings you would like to enter:");
        count = scan.nextInt();
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
  }
  }
