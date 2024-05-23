import java.util.*;
public class ques1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int var=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        

        switch(var){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a%b);
            break;
        }
    }
    
}
