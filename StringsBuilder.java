public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Ansh");
        
        //CharAt for any index value
        System.out.println(sb.charAt(0));

        //add character in string
        sb.setCharAt(0,'V');
        System.out.println(sb);

        //insert to add character
        sb.insert(1,'a');
        System.out.println(sb);
        
        //delete character
        sb.delete(0,1);
        System.out.println(sb);

        //append to add at last
        sb.append(' ');
        sb.append('K');
        sb.append('u');
        sb.append('m');
        sb.append('a');
        sb.append('r');
        System.out.println(sb);
        System.out.println(sb.length());

    }
    
}
