package instrukcje2;

import java.awt.event.ActionEvent;

// Definicja interfejsu określającego metody dotyczące rysowania i zmiany rozmiaru
interface Rysowalny {
    void rysuj(); // Metoda rysuj
    void zmienRozmiar(int nowyRozmiar); // Metoda zmienRozmiar z parametrem nowyRozmiar
}

// Interfejs A z metodą metodaA
interface A {
    void metodaA(); // Metoda metodaA
}

// Interfejs B z metodą metodaB
interface B {
    void metodaB(); // Metoda metodaB
}

// Interfejs ActionListener z metodą actionPerformed
interface ActionListener {
    void actionPerformed(ActionEvent e); // Metoda actionPerformed przyjmująca obiekt ActionEvent
}

// Klasa ImplementacjaAB implementująca interfejsy A, B, Rysowalny, ActionListener
class ImplementacjaAB implements A, B, Rysowalny, ActionListener {
    // Implementacja metody rysuj z interfejsu Rysowalny
    public void rysuj() {
        System.out.println("Rysowanie..."); // Wyświetlenie komunikatu "Rysowanie..."
    }

    // Implementacja metody zmienRozmiar z interfejsu Rysowalny
    public void zmienRozmiar(int nowyRozmiar) {
        System.out.println("Zmiana rozmiaru na: " + nowyRozmiar); // Wyświetlenie komunikatu o zmianie rozmiaru
    }

    // Implementacja metody metodaA z interfejsu A
    public void metodaA() {
        System.out.println("Wywołanie metodyA..."); // Wyświetlenie komunikatu "Wywołanie metodyA..."
    }

    // Implementacja metody metodaB z interfejsu B
    public void metodaB() {
        System.out.println("Wywołanie metodyB..."); // Wyświetlenie komunikatu "Wywołanie metodyB..."
    }

    // Implementacja metody actionPerformed z interfejsu ActionListener
    public void actionPerformed(ActionEvent e) {
        System.out.println("Obsługa zdarzenia: " + e.getActionCommand()); // Wyświetlenie komunikatu o obsłudze zdarzenia
    }
}

// Klasa PrzykladInterfejsow zawierająca metodę main
public class PrzykladInterfejsow {
    public static void main(String[] args) {
        // Tworzenie obiektu ImplementacjaAB
        ImplementacjaAB obj = new ImplementacjaAB();

        // Wywołanie metod zdefiniowanych w interfejsach
        obj.rysuj(); // Wywołanie metody rysuj z interfejsu Rysowalny
        obj.zmienRozmiar(10); // Wywołanie metody zmienRozmiar z interfejsu Rysowalny z parametrem 10
        obj.metodaA(); // Wywołanie metody metodaA z interfejsu A
        obj.metodaB(); // Wywołanie metody metodaB z interfejsu B
    }
}
