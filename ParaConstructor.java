
public class ParaConstructor {
    public static void main(String[] args) {

    
    Student s1=new Student("Ansh",19);
    Student s2=new Student("Happy",19);

    s1.printinfo();
    s2.printinfo();
    
}
}

class Student{
        String name;
        int age;

        void printinfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }
}
