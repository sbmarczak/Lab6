package zadania3;

// Interfejs Zamowienie
interface Zamowienie {
    double obliczCene();
    void pokazSzczegoly();
}

// Klasa Produkt implementująca interfejs Zamowienie
class Produkt implements Zamowienie {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public double obliczCene() {
        return cena;
    }

    @Override
    public void pokazSzczegoly() {
        System.out.println("Produkt: " + nazwa + ", Cena: " + cena);
    }
}

// Klasa Usluga implementująca interfejs Zamowienie
class Usluga implements Zamowienie {
    private String opis;
    private double koszt;

    public Usluga(String opis, double koszt) {
        this.opis = opis;
        this.koszt = koszt;
    }

    @Override
    public double obliczCene() {
        return koszt;
    }

    @Override
    public void pokazSzczegoly() {
        System.out.println("Usługa: " + opis + ", Koszt: " + koszt);
    }
}

// Testowanie implementacji
public class InterfejsZamowienie {
    public static void main(String[] args) {
        Produkt produkt = new Produkt("Laptop", 3200.0);
        Usluga usluga = new Usluga("Naprawa", 200.0);

        produkt.pokazSzczegoly(); // Wyświetli szczegóły produktu
        System.out.println("Cena produktu: " + produkt.obliczCene()); // Oblicza cenę produktu

        usluga.pokazSzczegoly(); // Wyświetli szczegóły usługi
        System.out.println("Cena usługi: " + usluga.obliczCene()); // Oblicza cenę usługi
    }
}
