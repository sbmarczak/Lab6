package zadania3;

// Klasa Osoba z polami imie i nazwisko oraz przesłoniętą metodą toString
class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba: " + imie + " " + nazwisko;
    }
}

// Podklasa Student rozszerzająca klasę Osoba, dodająca pole rokStudiow i przesłaniająca metodę toString
class Student extends Osoba {
    private int rokStudiow;

    public Student(String imie, String nazwisko, int rokStudiow) {
        super(imie, nazwisko);
        this.rokStudiow = rokStudiow;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ", rok studiów: " + rokStudiow;
    }
}

public class OsobaPrzyklad {
    public static void main(String[] args) {
        // Tworzenie obiektów klasy Osoba i Student
        Osoba osoba = new Osoba("Marek", "Malinowski");
        Student student = new Student("Tomasz", "Cios", 2);

        // Wywołanie metody toString dla obiektów Osoba i Student
        System.out.println(osoba.toString());
        System.out.println(student.toString());
    }
}
