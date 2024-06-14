class myth extends Thread{
    public myth(String name){
        super();
    }

    public void run(){
        System.out.println("this is const class");
    }
    
}
public class threas_Constructor {
    public static void main(String[] args) {
        myth m1=new myth("Ansh");
        m1.start();
        System.out.println("the id is"+m1.getId());
        System.out.println(m1.getName());
    }
}
