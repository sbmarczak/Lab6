package zadania2;

class KlasaBazowa {
    void metoda() {
        System.out.println("To jest metoda z klasy bazowej");
    }
}

class KlasaPochodna1 extends KlasaBazowa {
    @Override
    void metoda() {
        System.out.println("To jest metoda z klasy pochodnej 1, przesłaniająca metodę klasy bazowej");
    }
}

class KlasaPochodna2 extends KlasaBazowa {
    @Override
    void metoda() {
        System.out.println("To jest metoda z klasy pochodnej 2, przesłaniająca metodę klasy bazowej");
    }
}

public class PrzykladTablicyBazowej {
    public static void main(String[] args) {
        KlasaBazowa[] tablica = new KlasaBazowa[2];

        tablica[0] = new KlasaPochodna1(); // Obiekt klasy pochodnej 1 w tablicy typu bazowego
        tablica[1] = new KlasaPochodna2(); // Obiekt klasy pochodnej 2 w tablicy typu bazowego

        for (KlasaBazowa element : tablica) {
            element.metoda(); // Wywołanie przesłoniętej metody dla obiektów w tablicy
        }
    }
}

