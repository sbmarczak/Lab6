package zadania2;

import java.io.Serializable; // potrzebna biblioteka

// Klasa Produkt implementuje interfejsy Serializable, Cloneable i Comparable
class Produkt implements Serializable, Cloneable, Comparable<Produkt> {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    // Implementacja metody compareTo() z interfejsu Comparable
    @Override
    public int compareTo(Produkt p) {
        return Double.compare(this.cena, p.cena);
    }

    // Implementacja metody clone() z interfejsu Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Gettery i settery
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}

public class InterfejsyPrzyklady {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Banan", 1.99);
        Produkt produkt2 = new Produkt("Winogrona", 9.49);

        // Porównanie produktów
        int wynikPorownania = produkt1.compareTo(produkt2);
        System.out.println("Wynik porównania: " + wynikPorownania);

        // Klonowanie produktu
        try {
            Produkt klonProduktu = (Produkt) produkt1.clone();
            System.out.println("Klon produktu: " + klonProduktu.getNazwa());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

