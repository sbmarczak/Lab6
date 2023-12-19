package zadania2;

// Definicja interfejsu
interface Ruch {
    void poruszajSie();
}

// Klasa Samochod implementuje interfejs Ruch
class Samochod implements Ruch {
    public void poruszajSie() {
        System.out.println("Samochód jedzie");
    }
}

public class Rzutowanie {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.poruszajSie();  // Wydrukuje: "Samochód jedzie"

        // Rzutowanie obiektu klasy Samochod na interfejs Ruch
        Ruch ruch = (Ruch) samochod;
        ruch.poruszajSie();  // Wydrukuje: "Samochód jedzie"
    }
}
