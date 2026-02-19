public class Driver {


    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.start();
        tesla.drive();

        System.out.println(tesla.getCurrFuelLevel());
        tesla.addFuel(5);
        System.out.println(tesla.currFuelInLtr);
        tesla.drive();
         System.out.println(tesla.currFuelInLtr);
    }
    


    
}
