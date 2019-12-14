package pakiet1;

public class Klasa1 {

    static int licznik =0;

    public Klasa1() {
        licznik++;
    }

    static void metoda1(){
        System.out.println("Jesem metodą w pakiet1.Klasa1 i mam pole1 o wartości "+ licznik);
    };

    public static int getLicznik() {
        return licznik;
    }
}
