/**
 * Project: Lab 1 Motorcycle
 * Purpose Details: Class work
 * Course: IST 242
 * Author: Zizhou Xiang
 * Date Developed: 2026-01-20
 * Last Date Changed: 2026-01-25
 * Revision: 1.0
 */
public class Main {
    public static void main(String[]args){
        Engine e1 = new Engine(600);
        Wheel w1 = new Wheel(17);
        Seat s1 = new Seat("Leather");
        FuelTank t1 = new FuelTank(15.0);

        Engine e2 = new Engine(800);
        Wheel w2 = new Wheel(18);
        Seat s2 = new Seat("Leather");
        FuelTank t2 = new FuelTank(16.5);

        Engine e3 = new Engine(1000);
        Wheel w3 = new Wheel(18);
        Seat s3 = new Seat("Fabric");
        FuelTank t3 = new FuelTank(18.0);



        Motorcycle m1 = new Motorcycle("red","Honda",2020,e1,w1,s1,t1);
        System.out.println("Motorcycle color: "+ m1.getColor());
        System.out.println("Motorcycle brand:"+ m1.getBrand());
        System.out.println("Date of manufacture;"+ m1.getYear());
        System.out.println("Displacement :"+ m1.getEngine().getCc()+"cc");
        System.out.println("seat material: "+ m1.getSeat().getMaterial());
        System.out.println("Wheel size: "+ m1.getWheel().getSize()+"inch");
        System.out.println("Fuel tank: "+ m1.getTank().getCapacity()+"L tank");

        System.out.println("-------");

        Motorcycle m2 = new Motorcycle("blue","Yamaha",2021,e2,w2,s2,t2);
        System.out.println("Motorcycle color: "+ m2.getColor());
        System.out.println("Motorcycle brand:"+ m2.getBrand());
        System.out.println("Date of manufacture;"+ m2.getYear());
        System.out.println("Displacement :"+ m2.getEngine().getCc()+"cc");
        System.out.println("seat material: "+ m2.getSeat().getMaterial());
        System.out.println("Wheel size: "+ m2.getWheel().getSize()+"inch");
        System.out.println("Fuel tank: "+ m2.getTank().getCapacity()+"L tank");
        System.out.println("-------");

        Motorcycle m3 =new Motorcycle("black","Kawasaki",2022,e3,w3,s3,t3);
        System.out.println("Motorcycle color: "+ m3.getColor());
        System.out.println("Motorcycle brand:"+ m3.getBrand());
        System.out.println("Date of manufacture;"+ m3.getYear());
        System.out.println("Displacement :"+ m3.getEngine().getCc()+"cc");
        System.out.println("seat material: "+ m3.getSeat().getMaterial());
        System.out.println("Wheel size: "+ m3.getWheel().getSize()+"inch");
        System.out.println("Fuel tank: "+ m3.getTank().getCapacity()+"L tank");

    }
}

