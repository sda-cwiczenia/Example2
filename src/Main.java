import pakiet1.Klasa1;
import pakiet1.Klasa2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zanim stworzyłem obiekty mam ich "+Klasa1.getLicznik());


        Klasa1 obj1 = new Klasa1();
        System.out.println("Jest " + obj1.getLicznik() + " obiektów klasy pakiet1.Klasa1");
        Klasa1 obj2 = new Klasa1();
        System.out.println("Jest " + obj2.getLicznik() + " obiektów klasy pakiet1.Klasa1");
        Klasa1 obj3 = new Klasa1();
        System.out.println("Jest " + obj3.getLicznik() + " obiektów klasy pakiet1.Klasa1");
        Klasa1 obj4 = new Klasa1();
        Klasa1 obj5 = new Klasa1();
        Klasa1 obj6 = new Klasa1();
        Klasa1 obj7 = new Klasa1();
        System.out.println("Jest " + obj3.getLicznik() + " obiektów klasy pakiet1.Klasa1");
        //pakiet1.Klasa1.licznik = 150;
//        Klasa2 serwisant = new Klasa2();
//        serwisant.ustawLicznikwKlasie1(150);
        Klasa2.ustawLicznikwKlasie1(200);
        System.out.println("Jest " + obj3.getLicznik() + " obiektów klasy pakiet1.Klasa1");

//obj1.licznik = 3;
//obj1.metoda1();
//
//obj2.licznik = 5;
//obj2.metoda1();
//
//obj1.metoda1();

    }
}
