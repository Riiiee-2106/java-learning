public class Driver {

    static int minAge = 18;
    String name ;
    String dateOfLicense;
    int age;


    public boolean isAllowedToDrive(){
        return this.age>=Driver.minAge;
    }

   


    public static void main(String[] args) {


        Car swift = new Car("red");
        Car thar = new Car();
        swift = null;
        thar.start();
        thar.drive();
    }


    }