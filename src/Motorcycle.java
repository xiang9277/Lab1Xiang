public class Motorcycle {

    private String color;
    private String brand;
    private int year;
    private Engine engine;


    public Motorcycle(String color, String brand, int year, Engine engine){
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}