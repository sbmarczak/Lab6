package instrukcje;

// Klasa Vehilce
class Vehicle {
    /** DODANY KOD */
    public void start() {
        System.out.println("Metoda start() dla obiektu Vehicle została wywołana");
    }
    public void stop() {
        // metoda zatrzymujaca pojazd
    }
    public String toString() {
        // Implementacja metody toString()
        return "To jest pojazd";
    }
}

// Klasa Rower
class Bicycle extends Vehicle {
    //...
    /** DODANY KOD */
    @Override
    public void start() {
        System.out.println("Metoda start() dla obiektu Bicycle została wywołana");
    }
    @Override
    public void stop() {
        // metoda zatrzymujaca Rower
    }
}

// Klasa Motocykl
class Motorcycle extends Vehicle {
    //...
    /** DODANY KOD */
    @Override
    public void start() {
        System.out.println("Metoda start() dla obiektu Motorcycle została wywołana");
    }
    @Override
    public void stop() {
        // metoda zatrzymujaca Motocykl
    }
}

// Klasa Samochód
class Car extends Vehicle {
    //...
    /** DODANY KOD */
    @Override
    public void start() {
        System.out.println("Metoda start() dla obiektu Car została wywołana");
    }
    @Override
    public void stop() {
        // metoda zatrzymujaca Samochód
    }
}

public class Polimorfizm {
    public static void main(String[] args) {
        Vehicle[] veh = { new Bicycle(), new Motorcycle(), new Car() };
        veh[0].start(); // zostanie wywołana metoda start() dla obiektu Bicycle
        veh[1].start(); // zostanie wywołana metoda start() dla obiektu Motorcycle
        veh[2].start(); // zostanie wywołana metoda start() dla obiektu Car
    }
}

