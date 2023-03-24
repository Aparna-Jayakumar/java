import java.util.*;
public class Matrix
{
public static void main(String[] args)
{
System.out.println("Name : Aparna Jayakumar");
System.out.println("Admission_no: 22MCA012");
System.out.println("Date :24/03/2023");
int r,c;
Scanner x = new Scanner (System.in);
System.out.println("Number of rows");
r=x.nextInt();
System.out.println("Number of coloumn");
c=x.nextInt();
  int m1[][]=new int[r][c];
  int m2[][]=new int[r][c];
  int m3[][] = new int[r][c];   
             System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    m1[i][j] = x.nextInt();
                }
            }
            System.out.println("");
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    m2[i][j] = x.nextInt();
                }
            }
            System.out.println("");
            System.out.println("First Matrix:");
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    System.out.print(m1[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    System.out.print(m2[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    for (int k = 0; k < c; k++) 
                    {
                        m3[i][j] = m1[i][j] + m2[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < r; i++) 
            {
                for (int j = 0; j < c; j++) 
                {
                    System.out.print(m3[i][j]+" ");
                }
                System.out.println("");
            }
        }
        
    }
