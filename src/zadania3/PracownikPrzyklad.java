package zadania3;

// Definicja klasy Pracownik
class Pracownik {
    private String imie;
    private String nazwisko;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    public void pokazSzczegoly() {
        System.out.println("Imię: " + imie + ", Nazwisko: " + nazwisko + ", Stanowisko: " + stanowisko);
    }
}

public class PracownikPrzyklad {
    public static void main(String[] args) {
        // Tworzenie obiektu anonimowego klasy Pracownik
        new Pracownik("Tomasz", "Malinowski", "Sieciowiec") {
            // Użycie obiektu do wyświetlenia szczegółów pracownika
            {
                pokazSzczegoly();
            }
        };
    }
}
