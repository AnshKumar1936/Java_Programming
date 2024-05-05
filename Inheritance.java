public class Inheritance {
    public static void main(String args[]) {
        oops ok=new oops();
        ok.name="Hauser";
        ok.color="Blue";

        oops ok1=new oops();
        ok1.name="Pentonic";
        ok1.color="Black";

        ok.printinfo();
        ok1.printinfo();
        ok.write();
    }
    
    
}
class oops{
    
    String name;
    String color;

    void write(){
        System.out.println("Done");
    }
    void printinfo(){
        System.out.println(this.color);
        System.out.println(this.name);
    }
    
}
