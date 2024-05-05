import java.util.*;
public class InputNameprintinArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();
        String[] num = new String [size];
        for (int i=0;i<size;i++){
            num[i]=sc.next();
        }

        for(int i=0;i<num.length;i++){
            System.out.println("num " + (i+1) +" is : " + num[i]);
        }

        
    }
    
}
