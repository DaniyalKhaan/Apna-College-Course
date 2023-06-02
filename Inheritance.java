// Inheritance means using properties,variables of one class in another class or classes
// Note there are four types of Inheritance, I am implimenting all the types in new files.
class Shape {  // This class is Base/Parent/Super class bcz Rectangle class use its data type "int size"
    int size;

}
// To inherate/Use properties/functions of a class we use the word "extends".
class Rectangle extends Shape {  //  Sub/Child/Derived class 

}


public class Inheritance {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // object of Rectangle class
        r1.size = 20;  // giving value to Shape class by Rectangle's class object
    }
    
}
