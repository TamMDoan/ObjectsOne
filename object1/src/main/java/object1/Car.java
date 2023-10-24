package object1;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private int gallonsOfGas;

    public Car(String make, String model, int year, int mileage, int gallonsOfGas) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.gallonsOfGas = gallonsOfGas;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setGallonsOfGas(int gallonsOfGas){
        this.gallonsOfGas = gallonsOfGas;
    }

    public int getGallonsOfGas(){
        return this.gallonsOfGas;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
