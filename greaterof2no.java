import java.util.*;
public class greaterof2no {
    public static void greater(int a , int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        greater(x,y);
        
    }
    
}
