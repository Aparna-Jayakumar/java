public class Cpu{
    int price;
     class processor{
        int cores;
        String producer;
        processor(int noC, String manu){
            cores=noC;
            producer=manu;
        }
        void display(){
        System.out.println("\nProcessor info");
        System.out.println("No. of Cores = "+cores);
        System.out.println("Manufacturer = "+producer+"\n");
    }
    }
    static class ram{
        int mem;
        String manuf;
        ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("course_name:OOP LAB");
        System.out.println("Course_code:20MCA132");
        System.out.println("  Name     : Aparna Jayakumar");
        System.out.println("Register_no: SJC22MCA-2012");
        System.out.println("   Date    :28/03/2023");
        System.out.println("\nRAM info.........");
        System.out.println("Memory = "+mem+" GB");
        System.out.println("Manufacturer = "+manuf+"\n");
    }}
    public static void main(String[] args) {
         Cpu.ram obj1= new Cpu.ram(8,"Intel");
         Cpu obj2 = new Cpu();
         Cpu.processor obj3 = obj2.new processor(8,"Samsung");
         obj1.display();
         obj3.display();

    }
}

