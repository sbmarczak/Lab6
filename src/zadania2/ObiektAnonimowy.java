package zadania2;

// Definicja interfejsu
interface Powitanie {
    void powiedzCzesc();
}

public class ObiektAnonimowy {
    public static void main(String[] args) {
        // Tworzenie obiektu anonimowego z klasy anonimowej implementującej interfejs Powitanie
        Powitanie powitanie = new Powitanie() {
            @Override
            public void powiedzCzesc() {
                System.out.println("Cześć!");
            }
        };

        // Wywołanie metody na obiekcie anonimowym
        powitanie.powiedzCzesc();  // Wydrukuje: "Cześć!"
    }
}
