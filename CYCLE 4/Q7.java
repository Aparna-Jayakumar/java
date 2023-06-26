import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable
{
    List<Integer> flist;
    int max_size = 5;
    int i=0;
    Producer(List<Integer> flist)
    {
        this.flist = flist;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                produce(i++);
            } 
            catch (Exception e)
            {
                System.out.println("Interuption "+e);
            }
        }
    }
    public void produce(int i) throws InterruptedException
    {
        synchronized (flist)
        {
            while(flist.size()==max_size)
            {
                System.out.println("Production full,waiting to consume");
                flist.wait();
            }
        }
        synchronized(flist)
        {
            System.out.println("Producer produced "+i);
            flist.add(i);
            flist.notify();
        }
    }

}
class Consumer implements Runnable
{
    List<Integer> flist;
    Consumer(List<Integer> flist)
    {
        this.flist = flist;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                consume();
            } catch (Exception e)
            {
                System.out.println("Exception "+e);
            }
        }
    }
    public void consume() throws InterruptedException
    {
        synchronized (flist)
        {
            while(flist.isEmpty())
            {
                System.out.println("Fully consumed, Need to produce");
                flist.notify();
                Thread.sleep(500);
                flist.wait();
            }
        }
        synchronized(flist)
        {
            Thread.sleep(1000);
            System.out.println("Consumer consumed "+flist.remove(0));
        }
    }

}
public class Q7 {
    public static void main(String[] args)
    {
      System.out.println("course_name:OOP LAB");
   System.out.println("Course_code:20MCA132");
   System.out.println("  Name     : Aparna Jayakumar");
   System.out.println("Register_no: SJC22MCA-2012");
   System.out.println("  Date     :26/06/2023");
        List<Integer> flist = new ArrayList<Integer>();
        Thread th1 = new Thread(new Producer(flist));
        Thread th2 = new Thread(new Consumer(flist));
        th1.start();
        th2.start();
    }
}
