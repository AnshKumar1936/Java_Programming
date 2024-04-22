import java.util.*;
public class circumofcircle {

    public static void circircle(int r){
        double circumference=2*3.14*r;
        System.out.println(circumference);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        circircle(a);
    }
}
