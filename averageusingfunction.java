import java.util.*;
public class averageusingfunction {
    public static void avg(int a,int b,int c){
        int average=(a+b+c)/3;
        System.out.println(average);
    }
    


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        avg(x,y,z);
    }
}
