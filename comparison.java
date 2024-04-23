import java.util.*;
public class comparison {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("NUM1 is greater");
        }
        else if(num1<num2){
            System.out.println("NUM2 is greater");
        }
        else{
            System.out.println("both are equal");
        }
        }
}

