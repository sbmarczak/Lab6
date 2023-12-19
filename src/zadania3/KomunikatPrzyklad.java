package zadania3;

// Definicja interfejsu Komunikat
interface Komunikat {
    void wyswietl(String komunikat);
}

public class KomunikatPrzyklad {
    public static void main(String[] args) {
        // Tworzenie obiektu anonimowego implementującego interfejs Komunikat
        Komunikat komunikat = new Komunikat() {
            @Override
            public void wyswietl(String komunikat) {
                System.out.println(komunikat);
            }
        };

        // Użycie obiektu do wyświetlenia różnych komunikatów
        komunikat.wyswietl("Jeden, Dwa, Trzy!");
        komunikat.wyswietl("Dowolny komunikat dwa.");
        komunikat.wyswietl("Dowolny komunikat trzy.");
    }
}
