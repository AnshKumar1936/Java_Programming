import java.util.*;
public class eligibleforvote {

    public static void vote(int n){
        if(n>18){
            System.out.println("ADULT");
        }
        else{
            System.out.println("NOT ADULT");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        vote(a);   
}

}
