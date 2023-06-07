import java.util.*;
class Array
{
public static void main(String args[])
{
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("Date       :05/04/2023");
Scanner sc=new Scanner(System.in);
int i,n,s,flag=0;
System.out.println("enter the number of elements :");
n=sc.nextInt();
int [] a=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the element to be searched:");
s=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==s)
{
System.out.println("Element " + s + "found at "+ i + " position");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Element not found");
}
}
}

