import java.util.*;  
public class arraylist{  
public static void main(String args[]){  
 ArrayList<String> list=new ArrayList<String>();    
     list.add("January");  
     list.add("February");    
     list.add("March");    
     list.add("april");
     list.add("May");  
     list.add("June");  
     list.add("July");      
     list.add("August");  
     list.add("September");  
     list.add("October");  
     list.add("November");  
     list.add("December"); 
    //  int total=list.size();
    for(int i=0;i<list.size();i++){
     if(i%2==0){
        System.out.println(list.get(i));
     }
    }
}
}