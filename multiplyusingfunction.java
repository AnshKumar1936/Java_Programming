import java.util.*;
public class multiplyusingfunction {
    public static int calc(int a, int b){
        int pro=a*b;
        return pro;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int pro= calc(x,y);

        System.out.println(pro);


    }
    
}
