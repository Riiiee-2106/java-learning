public class Driver {

    static int minAge = 18;
    String name ;
    String dateOfLicense;
    int age;


    public boolean isAllowedToDrive(){
        return this.age>=Driver.minAge;
    }


    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.start();
        tesla.drive();

        System.out.println(tesla.getCurrFuelLevel());
        tesla.addFuel(5);
        System.out.println(tesla.currFuelInLtr);
        tesla.drive();
         System.out.println(tesla.currFuelInLtr);


         Driver myDriver = new Driver();
         
        //  dateOFLicense = "1/Jan/2025"; ->cannot access
        myDriver.dateOfLicense = "1/Jan/2025";

        System.out.println(minAge);
    }
    


    
}
