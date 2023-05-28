class Mobile {
    String mobileName;
    int mobilePrice;
    public void mobileInfo() {
        System.out.println(this.mobileName);
        System.out.println(this.mobilePrice);
        
    }
    Mobile(String mobileName, int mobilePrice) {
        this.mobileName = mobileName;
        this.mobilePrice = mobilePrice;

    }

}
public class Roughwork {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Iphone 12 pro Max", 200000 );
        m1.mobileInfo();

        
    }
}
