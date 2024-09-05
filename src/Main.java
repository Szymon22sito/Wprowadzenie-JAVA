import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("na lekcji");

        int wylosowana = (int)(Math.random()*100+1);
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
        int roznica = wylosowana>wpisanaLiczba? wylosowana - wpisanaLiczba:wpisanaLiczba-wylosowana;
        roznica = roznica/10;//dzielenie calkowite bo wynik int
        switch (roznica){
            case 0:
                System.out.println("Brawo");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Dość blisko");
                break;
            default:
                System.out.println("Spróbuj szczęscia innym razem");


        }
        //wyrarzenie switch
        System.out.println(
                switch (roznica){
                    case 0 -> "Brawo";
                    case 1 -> "Bardzo blisko";
                    case 2 -> "Dość blisko";
                    default -> "Słabo";
                }
        );

        //zgadywanie 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Zgadnij liczbę, próba nr "+(i+1));
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowana){
                System.out.println("Wygrana");
                break;
            }
            else {
                if (wpisanaLiczba>wylosowana){
                    System.out.println("Wpisano za dużo");
                }
                else {
                    System.out.println("Wpisano za mało");
                }
            }
        }
    }
}