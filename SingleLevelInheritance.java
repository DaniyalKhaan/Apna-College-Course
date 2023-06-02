class Car{
    String brand;
}
class Cost extends Car{
    public void printInfo(){
        brand = "Mercedes Benz";
        System.out.println(brand);
    }

}


public class SingleLevelInheritance {
    public static void main(String[] args) {
        Cost c1 = new Cost();
        c1.printInfo(); 
        
    }
}
