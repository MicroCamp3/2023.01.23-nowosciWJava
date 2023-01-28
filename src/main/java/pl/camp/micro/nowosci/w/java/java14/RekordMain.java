package pl.camp.micro.nowosci.w.java.java14;

public class RekordMain {
    public static void main(String[] args) {
        Rekord rekord = new Rekord("Janusz", "Kowalski", 50);

        System.out.println(rekord.imie());
        System.out.println(rekord.nazwisko());
        System.out.println(rekord.wiek());

        rekord.metoda();

    }
}
