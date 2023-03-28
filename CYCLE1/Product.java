public class Product
{
  String pname,pcode;
 int price;
  void getdata(String p1, String p2,int p3)
  {
    pname=p1;
    pcode=p2;
    price=p3;
   
  }
public static void main(String[] args)
{
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("   Date    :24/03/2023");
int s;
Product a,b,c;
a=new Product();
b=new Product();
c=new Product();
a.getdata("1045A","apple",20);
b.getdata("1056B","stawberry",40);
c.getdata("1098C","orange",30);
if(a.price<b.price  && a.price<c.price)
 s=a.price;
else if(b.price<a.price && b.price<c.price)
s=b.price;
else
s=c.price;
System.out.println("Smallest price=  \n\n"+s);
}
}
