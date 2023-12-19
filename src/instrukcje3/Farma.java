package instrukcje3;
abstract class Zwierze {
    abstract void dajGlos();
}
public class Farma {
    public static void main(String[] args) {
        // Utworzenie obiektu anonimowego dziedziczącego po klasie abstrakcyjnej Zwierze
        Zwierze kura = new Zwierze() {
            @Override
            void dajGlos() {
                System.out.println("Kukuryku!");
            }
        };
        // Wywołanie metody obiektu anonimowego
        kura.dajGlos();
    }
}
