package instrukcje2;

abstract class Abstrakcyjna {
    public abstract void metodaAbstrakcyjna();
}

class Klasa extends Abstrakcyjna {
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Już nie");
    }
}

abstract class Figura {
    // Konstruktor, pola, metody z implementacją

    // Metoda abstrakcyjna bez implementacji
    abstract double obliczPole();

    // Metoda z implementacją
    void wyswietlInformacje() {
        System.out.println("To jest figura.");
    }
}

public class PrzykladAbstrakcji {
    public static void main(String[] args) {
        Klasa obiekt = new Klasa();
        obiekt.metodaAbstrakcyjna(); // Wyświetli: Już nie

        // Nie można utworzyć obiektu klasy abstrakcyjnej Figura
        // Figura figura = new Figura(); // To spowoduje błąd kompilacji

        // Tworzenie obiektu klasy dziedziczącej po Figura (np. prostokąt, koło, itp.)
        // i dostęp do metod tej klasy
        Figura prostokat = new Figura() {
            @Override
            double obliczPole() {
                // Implementacja obliczania pola dla prostokąta
                return 5.0 * 10.0;
            }
        };

        prostokat.wyswietlInformacje(); // Wyświetli: To jest figura.
        System.out.println("Pole prostokąta: " + prostokat.obliczPole()); // Wyświetli: Pole prostokąta: 50.0
    }
}
