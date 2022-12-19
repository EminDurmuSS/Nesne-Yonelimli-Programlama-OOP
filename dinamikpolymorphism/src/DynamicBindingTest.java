//Dinamik Ciltleme/Çalışma Zamanı Polimorfizmi:
// Çalışma zamanı Polimorfizm ayrıca geçersiz kılma yöntemi olarak da bilinir. Geçersiz kılma işlevine yapılan çağrının Çalışma Zamanında çözümlendiği bu Mekanizmada.

public class DynamicBindingTest {

    public static void main(String args[]) {
        Vehicle vehicle = new Car(); //here Type is vehicle but object will be Car
        vehicle.start();       //Car's start called because start() is overridden method
    }
}

class Vehicle {

    public void start() {
        System.out.println("Inside start method of Vehicle");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Inside start method of Car");
    }
}