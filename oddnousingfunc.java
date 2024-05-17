import java.util.*;
public class oddnousingfunc {

    public static void printodd(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int m = sc.nextInt();
        printodd(m);
    }
    
}
