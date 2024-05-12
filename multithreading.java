class myth1 extends Thread{
    public void run(){
        System.out.println("this is a MYTH1 class");
    }

    
}

class myth2 extends Thread{
    public void run(){
        System.out.println("this is a MYTH2 class");
    }

}

public class multithreading{

    public static void main(String[] args) {
        myth1 o1=new myth1();
        myth2 o2=new myth2();
        o1.start();
        o2.start();
         
    }

}