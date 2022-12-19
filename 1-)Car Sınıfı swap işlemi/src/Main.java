
public class Main {
    public static void main(String[] args) {
        Car myCar=new Car();
        System.out.println("My car: "+myCar.year+" "+myCar.make+" "+myCar.model+" "+myCar.speed+" "+myCar.distance);

        myCar.make="Mercedes";
        myCar.model="E200";
        myCar.year="2001";
        myCar.speed=80;
        myCar.distance=30_000;
        System.out.println("My car: "+myCar.year+" "+myCar.make+" "+myCar.model+" "+myCar.speed+" "+myCar.distance);
        Car yourCar=new Car();
        yourCar.make="Toyota";
        yourCar.speed=0;
        yourCar.year="2011";
        yourCar.distance=60_000;
        yourCar.model="Camry";
        System.out.println("your car: "+yourCar.year+" "+yourCar.make+" "+yourCar.model+" "+yourCar.speed+" "+yourCar.distance);
        System.out.println();

        //Car tmpCar =myCar;
        myCar=yourCar;
        //yourCar=tmpCar;

        System.out.println("My car: "+myCar.year+" "+myCar.make+" "+myCar.model+" "+myCar.speed+" "+myCar.distance);
        System.out.println("your car: "+yourCar.year+" "+yourCar.make+" "+yourCar.model+" "+yourCar.speed+" "+yourCar.distance);
        System.out.println();

        myCar.speed=150;
        yourCar.speed=200;

        System.out.println("My car: "+myCar.year+" "+myCar.make+" "+myCar.model+" "+myCar.speed+" "+myCar.distance);
        System.out.println("your car: "+yourCar.year+" "+yourCar.make+" "+yourCar.model+" "+yourCar.speed+" "+yourCar.distance);



    }
}