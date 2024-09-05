import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("na lekcji");

        int wylosowana = (int)(Math.random()*10+1);
        System.out.println(wylosowana);
        /*
        typy proste
        logiczny : boolean
        całkowite: byte, short, int , long
        rzeczywiste: float, double
        znakowy: char
        typy złożone zawsze pisane wielką literą obiekty które mją własnosci i metody
         */


        //git int
        // git config user.email
        //             user.name
        //git add
        //git commit -m ""
        //git log
        //git push -u orgin master
        System.out.println("zgadnij liczbe z zakresu 1,10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();// wczytywanie z klawiatury
        System.out.println("Wpisano z klawiatury " + wpisanaLiczba);
        //instrukcja warunkowa
        if(wpisanaLiczba == wylosowana){
            System.out.println("Trafiona liczba");
        }
        else {
            System.out.println("Nie trafiono spróbuj ponownie");
        }
        //wyrażenie warunkowe
        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie":"Niepoprawnie";
        System.out.println(komunikat);
    }
}