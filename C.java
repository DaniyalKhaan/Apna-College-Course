// header = make a class name Student, a function name printInfo and a objecr name s1;
public class C {  //main class
    public static void main (String[] args) {  // main function
        Student s1 = new Student();  // making object
        s1.name = "Danish";
        s1.age = 16;
        s1.grade = 8;
        s1.printInfo();

    }

}
class Student {   // 2nd class 
    String name;
    int age;
    int grade;
    public void printInfo () {  // declaring function/method
        System.out.println(this.name); // using this to tell syso line 
                                       // which thing is to be printed
        System.out.println(this.grade);
        System.out.println(this.age);
    }
}

