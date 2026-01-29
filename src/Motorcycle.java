/**
 * Project: Lab 1 Motorcycle
 * Purpose Details: Class work
 * Course: IST 242
 * Author: Zizhou Xiang
 * Date Developed: 2026-01-20
 * Last Date Changed: 2026-01-25
 * Revision: 1.0
 */
public class Motorcycle {

    private String color;
    private String brand;
    private int year;
    private Engine engine;
    private Wheel wheel;
    private Seat seat;
    private FuelTank tank;

    public Motorcycle(String color, String brand, int year, Engine engine,Wheel wheel, Seat seat, FuelTank tank){
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
        this.wheel = wheel;
        this.seat = seat;
        this.tank = tank;

    }
    public String getColor(){
        return this.color;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getWheel(){
        return wheel;
    }

    public Seat getSeat() {
        return seat;
    }

    public FuelTank getTank() {
        return tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setTank(FuelTank tank) {
        this.tank = tank;
    }
}
