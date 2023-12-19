package instrukcje3;

import java.util.ArrayList;
import java.util.List;

public class AplikacjaGPS {

    // Klasa reprezentująca punkt GPS
    private static class Punkt {
        private double szerokosc;
        private double dlugosc;

        public Punkt(double szerokosc, double dlugosc) {
            this.szerokosc = szerokosc;
            this.dlugosc = dlugosc;
        }

        @Override
        public String toString(){
            return "(" + szerokosc + ", " + dlugosc + ")";
        }
    }

    // Klasa reprezentująca trasę GPS
    private static class Trasa {
        private List<Punkt> punktyTrasy;

        public Trasa(){ this.punktyTrasy = new ArrayList<>(); }

        public void dodajPunkt(double szerokosc, double dlugosc){
            Punkt nowyPunkt = new Punkt(szerokosc, dlugosc);
            punktyTrasy.add(nowyPunkt);
        }

        public void wyswietlTrase(){
            System.out.println("Trasa GPS:");
            for (Punkt punkt : punktyTrasy){
                System.out.println(punkt);
            }
        }
    }

    // Pole nowaTrasa klasy AplikacjaGPS
    private Trasa nowaTrasa = new Trasa();

    public static void main(String[] args) {
        AplikacjaGPS aplikacja = new AplikacjaGPS();

        // Dodawanie punktów do trasy
        aplikacja.nowaTrasa.dodajPunkt(51.5, 19.0);
        aplikacja.nowaTrasa.dodajPunkt(52.0, 19.5);
        aplikacja.nowaTrasa.dodajPunkt(52.5, 20.0);

        // Wyświetlenie trasy
        aplikacja.nowaTrasa.wyswietlTrase();
    }
}

