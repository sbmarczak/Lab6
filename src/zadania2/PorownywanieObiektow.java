package zadania2;

class Osoba {
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    // Nadpisanie metody equals() w celu porównania pól obiektów
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Osoba osoba = (Osoba) obj;
        return wiek == osoba.wiek && imie.equals(osoba.imie);
    }

    // Metoda main do przetestowania porównania obiektów
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", 30);
        Osoba osoba2 = new Osoba("Jan", 30);
        Osoba osoba3 = new Osoba("Alicja", 25);

        System.out.println("Czy osoba1 jest równa osobie2? " + osoba1.equals(osoba2)); // Powinno zwrócić true
        System.out.println("Czy osoba1 jest równa osobie3? " + osoba1.equals(osoba3)); // Powinno zwrócić false
    }
}

