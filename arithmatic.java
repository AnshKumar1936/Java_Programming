import java.util.Scanner;
class arithmatic{
    public static void main(String args[]){
        Scanner one = new Scanner(System.in);
        int a= one.nextInt();
        int b= one.nextInt();
        int  add=a+b;
        int diff=a-b;
        int mul=a*b;
        float div=a/b;
        int equ=a*b/a+b;
        System.out.println(add);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(equ);
    }
}

// import java.util.Scanner; // import the Scanner class

// class Main {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);
//     String userName;

//     // Enter username and press Enter
//     System.out.println("Enter username");
//     userName = myObj.nextLine();

//     System.out.println("Username is: " + userName);
//   }
// }