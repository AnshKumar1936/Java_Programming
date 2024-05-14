public class NparaConstructor {
    public static void main(String[] args) {

    
    Student s1=new Student();
    s1.name ="Ansh";
    s1.age=19;

    s1.printinfo();
    
}
}

class Student{
        String name;
        int age;

        void printinfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Student(){
            System.out.println("Constructor Called");
        }
}
