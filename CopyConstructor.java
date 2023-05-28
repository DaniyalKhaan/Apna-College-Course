// making a copy constructor;

class Hostel {
    int rooms;
    int rent;

    public void hostelDetails(){
        System.out.println(this.rooms);
        System.out.println(this.rent);
    }
    // this constructor is our copy constructor;

    Hostel(Hostel h2){  // we are giving h2 in parameters.
        this.rooms = h2.rooms; //  again using h2.
        this.rent = h2.rent;   //  =
    } // copy cnstrctr till here
    Hostel() {

    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Hostel h1 = new Hostel();
        h1.rooms = 42;
        h1.rent = 5000;

        Hostel h2 = new Hostel(h1);
        h2.hostelDetails();  // calling h2 while we havent given the details
        // of h2, we are simply coping h1 while printing h2 details.
    }
    
}
