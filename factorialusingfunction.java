import java.util.*;
public class factorialusingfunction {
    public static void printfact(int n){
        int factorial=1;
        for(int i=n; i>=1;i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int m =sc.nextInt();
        printfact(m);
    }
    
}
