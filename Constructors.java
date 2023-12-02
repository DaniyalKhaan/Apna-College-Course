// Note : constructor is define in line 33;
// main class
class Constructors {
// main function
    public static void main(String[] args) {
        Smartphone p1 = new Smartphone();
        p1.name = "A13";
        p1.company = "Samsung";
        p1.specs = "4gb ram and 128gb room";
        p1.price = 45000;
        p1.printInfo();
    }
    
}
// 2nd class;
class Smartphone {
    
    String name;
        String company;
        String specs;
        int price;
        // declaring fuction/method by the name printInfo
    public void printInfo() {
        
        System.out.println(this.name);
        System.out.println(this.company);
        System.out.println(this.specs);
        System.out.println(this.price);

          System.out.println(this.price);
        
    }
    // declaring a constructor;

    Smartphone() {
        System.out.println("constructor callled");
    }
}
