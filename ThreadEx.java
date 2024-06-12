import java.util.Scanner;
    class Table1 extends Thread {
        private int number;
        public Table1(int number) {
            this.number = number;
        }
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public class ThreadEx{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int userNumber = sc.nextInt();
            Table1 childThread = new Table1(userNumber);
            childThread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main thread woke up after 1000 ms.");
            sc.close();
        }
    }