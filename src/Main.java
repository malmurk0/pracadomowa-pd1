import java.sql.SQLOutput;
import java.util.Scanner;

 class Osoba{
    String imie;
    String nazwisko;
    int wiek;




 public Osoba(String imie, String nazwisko, int wiek){

    this.imie = imie;
    this.nazwisko= nazwisko;
    this.wiek= wiek;

 }

public void wyswietl(){

     System.out.println("imie: "+  imie);
     System.out.println("nazwisko: " + nazwisko);
     System.out.println("wiek: " + wiek   );

}

 }



public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
    String imie = scanner.nextLine();

    System.out.println("Podaj nazwisko: ");
    String nazwisko = scanner.nextLine();

    System.out.println("Podaj wiek: ");
    int wiek = scanner.nextInt();


        Osoba osoba = new Osoba( imie , nazwisko ,wiek);
        osoba.wyswietl();

        scanner.close();



    }
}