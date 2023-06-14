import java.util.Scanner;

interface prop
{
    void getdata();
    void area();
    void perimeter();
}

class Circle implements prop
{
    double pi = 3.14;
    double r;
    Scanner sc = new Scanner(System.in);
    @Override
    public void getdata()
    {
        System.out.println("Enter the radius of the circle:");
        r = sc.nextDouble();
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter of the circle: "+(2*pi*r));
    }
    @Override
    public void area()
    {
        System.out.println("Perimeter of the circle: "+(pi*r*r));
    }
}

class Rectangle implements prop
{
    double l,b;
    Scanner sc = new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter the length of the rectangle:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b = sc.nextDouble();
    }
    public void area()
    {
        System.out.println("Perimeter of a rectangle: "+(l*b));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of a rectangle: "+(2*(l+b)));
    }
}

public class Function
{
    public static void main(String[] args) 
    {
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("Date       :07/06/2023");
        int ch;
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle();
        Rectangle obj = new Rectangle();
        do
        {
            System.out.println("\n1.Circle\n2.Rectangle\n3.exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 :ob.getdata();
                        ob.area();
                        ob.perimeter();
                        break;
                case 2 :obj.getdata();
                        obj.area();
                        obj.perimeter();
                        break;
                case 3 :System.out.println("Exited...");
                        System.exit(0);
            }
        }while(true);
    }
}

