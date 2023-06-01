class Teacher {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
// note: in parameterized cnstrctor we write data types in its ()parameters 
//  declaring a parameterized constructor
    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}

public class ParameterizedConstructer {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Zeshan", 28);
        t1.printInfo();
        
    }
}
