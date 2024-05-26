import java.util.*;
public class ques3 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n>80 && n<101){
            System.out.println("excellent");
        }
        else if(n>60 && n<81){
            System.out.println("very good");
        }
        else if(n>40 && n<61){
            System.out.println("good");
        }
        else if(n>20 && n<41){
            System.out.println("keep it up");
        }
        else{
            System.out.println("failed");
        }
                

    }
    
}
