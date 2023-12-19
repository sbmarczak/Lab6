package instrukcje;

class Base{
    void metoda(){
        System.out.println("Bazowa");
    }
}

class Klasa extends Base{
    void metoda(){
        System.out.println("Potomna");
    }
}
class Zwierze {
    void dajGlos() {
        System.out.println("Dźwięk zwierzęcia");
    }
}

class Pies extends Zwierze {
    // Przesłaniamy metodę dajGlos z klasy Zwierze
    void dajGlos() {
        System.out.println("Hau, hau!");
    }
}



public class Przyklad {
    public static void main(String[] args) {
        Base base = new Base();
        base.metoda(); // Wyświetli: Bazowa
        Klasa klasa = new Klasa();
        klasa.metoda(); // Wyświetli: Potomna
        // Przy użyciu referencji klasy nadrzędnej
        Base base2 = new Klasa();
        base2.metoda(); // Wywoła metodę z klasy Klasa: Potomna

        Zwierze zwierze = new Zwierze();
        zwierze.dajGlos(); // Wyświetli: Dźwięk zwierzęcia.
        Pies pies = new Pies();
        pies.dajGlos(); // Wyświetli: Hau, hau!
        // Przy użyciu referencji klasy nadrzędnej
        Zwierze zwierze2 = new Pies();
        zwierze2.dajGlos(); // Wywoła metodę z klasy Pies: Hau, hau!
    }
}
