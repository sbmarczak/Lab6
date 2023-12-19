package zadania;

class KlasaBazowa {
    void metoda() {
        System.out.println("To jest metoda z klasy bazowej");
    }

    void metodaPrzeciazona() {
        System.out.println("Metoda przeciążona w klasie bazowej");
    }
}

class KlasaPochodna extends KlasaBazowa {
    @Override
    void metoda() {
        System.out.println("To jest metoda z klasy pochodnej, przesłaniająca metodę klasy bazowej");
    }

    void metoda(int parametr) {
        System.out.println("Przeciążenie metody w klasie pochodnej - parametr: " + parametr);
    }

    void metodaPrzeciazona(String tekst) {
        System.out.println("Metoda przeciążona w klasie pochodnej - tekst: " + tekst);
    }
}

public class Przyklad {
    public static void main(String[] args) {
        KlasaBazowa obiektBazowy = new KlasaBazowa();
        KlasaPochodna obiektPochodny = new KlasaPochodna();

        obiektBazowy.metoda(); // Wywołanie metody z klasy bazowej
        obiektPochodny.metoda(); // Wywołanie metody z klasy pochodnej, przesłaniającej metodę klasy bazowej

        obiektPochodny.metoda(10); // Wywołanie przeciążonej metody w klasie pochodnej
        obiektPochodny.metodaPrzeciazona("Hello"); // Wywołanie przeciążonej metody z klasy pochodnej

        // Przesłonięcie metody z klasy bazowej przez metodę w klasie pochodnej
        obiektBazowy.metodaPrzeciazona();
        obiektPochodny.metodaPrzeciazona(); // Wywołanie przeciążonej metody z klasy pochodnej
    }
}
