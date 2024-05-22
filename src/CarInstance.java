public class CarInstance {
    public static void main(String[] args) {
        // Create instance of Car class
        Car firstCar = new Car();

        // Call the methods
        firstCar.startEngine();
        firstCar.stopEngine();

        // Assign values to class fields
        firstCar.brand = "Ferrari";
        firstCar.model = "F12";
        firstCar.year = 2012;

        // Print out field contents
        System.out.println("Brand: " + firstCar.brand);
        System.out.println("Model: " + firstCar.model);
        System.out.println("Year: " + firstCar.year);
    }
}
