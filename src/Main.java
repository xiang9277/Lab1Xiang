public class Main {
    public static void main(String[]args){
        Engine e1 = new Engine(600);
        Engine e2 = new Engine(800);
        Engine e3 = new Engine(1000);



        Motorcycle m1 = new Motorcycle("red","Honda",2020,e1);
        System.out.println(m1.getColor());
        System.out.println(m1.getBrand());
        System.out.println(m1.getYear());
        System.out.println(m1.getEngine().getCc());

        System.out.println("-------");

        Motorcycle m2 = new Motorcycle("blue","Yamaha",2021,e2);
        System.out.println(m2.getColor());
        System.out.println(m2.getBrand());
        System.out.println(m2.getYear());
        System.out.println(m2.getEngine().getCc());

        System.out.println("-------");

        Motorcycle m3 =new Motorcycle("black","Kawasaki",2022,e3);
        System.out.println(m3.getColor());
        System.out.println(m3.getBrand());
        System.out.println(m3.getYear());
        System.out.println(m3.getEngine().getCc());


    }
}
