class myth1 implements Runnable{
    public void run(){
        System.out.println("this is a MYTH1 class");
    }   
}
class myth2 implements Runnable{
    public void run(){
        System.out.println("this is a MYTH2 class");
    }

}

public class threadingUsingRunnable {
    public static void main(String[] args) {
        myth1 o1=new myth1();
        Thread O1=new Thread(o1);
        O1.start();
        myth2 o2=new myth2();
        Thread O2=new Thread(o2);
        O2.start();
        
    }
    
}
