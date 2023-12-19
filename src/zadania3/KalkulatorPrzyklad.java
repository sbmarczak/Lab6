package zadania3;

class Kalkulator {

    // Metody do dodawania
    public int dodaj(int a, int b) {
        return a + b;
    }

    public double dodaj(double a, double b) {
        return a + b;
    }

    // Metody do odejmowania
    public int odejmij(int a, int b) {
        return a - b;
    }

    public double odejmij(double a, double b) {
        return a - b;
    }

    // Metody do mnożenia
    public int pomnoz(int a, int b) {
        return a * b;
    }

    public double pomnoz(double a, double b) {
        return a * b;
    }

    // Metody do dzielenia
    public int podziel(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Dzielenie przez zero!");
        }
        return a / b;
    }

    public double podziel(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Dzielenie przez zero!");
        }
        return a / b;
    }

    // Metody do obliczania potęgi
    public int potega(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public double potega(double a, double b) {
        return Math.pow(a, b);
    }
}

public class KalkulatorPrzyklad {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("6 + 7 = " + kalkulator.dodaj(6, 7));
        System.out.println("72.5 - 9.5 = " + kalkulator.odejmij(72.5, 9.5));
        System.out.println("13 * 44 = " + kalkulator.pomnoz(13, 44));
        System.out.println("64 / 8 = " + kalkulator.podziel(64, 8));
        System.out.println("4 ^ 3 = " + kalkulator.potega(4, 3));
    }
}

