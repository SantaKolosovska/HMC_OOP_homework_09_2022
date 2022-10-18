package bonusExercise;

public class Car {

    private double fuelLevel = 0;
    private double fuelEfficiency;

    public Car() {
    }

    public Car(double fuelEfficiency) {
        if (fuelEfficiency<=0) {
           throw new IllegalArgumentException("Fuel efficiency must be larger than 0");
        }
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public void addFuel(int fuelAmount) {
        if (fuelAmount<=0) {
            throw new IllegalArgumentException("Added fuel amount must be larger than 0");
        }
        fuelLevel += fuelAmount;
    }

    public void drive(int km) {
        this.fuelLevel = this.fuelLevel - km / fuelEfficiency;
        if (fuelLevel < 0) {
            this.fuelLevel = 0;
            System.out.println("No fuel left in tank");
        }
    }


    public static void main(String[] args) {
        Car car = new Car(20);
        car.addFuel(10);
        car.drive(40);

        System.out.println("Remaining fuel: " + car.getFuelLevel());
    }
}
