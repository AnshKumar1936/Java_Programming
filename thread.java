// class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }
// public class thread {
//     public static void main(String args[]) {
//         MyThread thread1 = new MyThread();
//         MyThread thread2 = new MyThread();

//         // Start the threads
//         thread1.start();
//         thread2.start();
//     }
// }

import java.util.Scanner;
class threadd extends Thread{
    
    public void run(){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}


public class thread{
    public static void main(String[] args) {
        threadd op = new threadd();
        op.start();

        try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Main Thread Woke Up");

    }
}
