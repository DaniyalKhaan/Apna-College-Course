// Polymorphism: using objects of same name in a class/code is known as polymorphism
// polymorphism has two types; here we are discussing compile time polymorphism or function overloading
// in function overloading, we can declare many functions of same name but different parameters
// or if the perameters are also same then the return type of the method is to be differnt from one another
// otherwise the compiler will give error;
// conclusion:  in polymorphism we can declare a function;
//  name = same
//  return time should be different or/else
//  parmeters type should be different

class Players {
    String name;
    int age;

    public void printInfo(String name){     // Same name and also same return type
        System.out.println(name);           // so, using different parameters
    }

    public void printInfo(int age){        // Same name and also same return type
        System.out.println(age);             // so, using different parameters
    }
    public void printInfo(String name, int age){  //  Same name and also same return type
        System.out.println(name + " " + age);     // so, using different parameters
    }

}
class Teacher {
    String name;
    int age;
    public void printInfo(){
        System.out.println(name);
    }
    public void printInfo(String name){
        System.out.println(name);
    }
}




public class Polymorphism {
    public static void main(String[] args) {
        Players p1 = new Players();
        p1.name = "Shahid Afridi";
        p1.age = 46;
        p1.printInfo(p1.name);  // calling function of first parameter
        p1.printInfo(p1.age);    // calling function of second pararmeter
        p1.printInfo(p1.name, p1.age);  // calling function of third parameter

    }

}
