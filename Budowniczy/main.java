public class main
{
    public static void main(String[] args)
    {

        Czlowiek czlowiek = new Czlowiek();
        czlowiek.setImie("Damian");
        czlowiek.setNazwisko("Cichosz");
        czlowiek.setWiek(17);
        czlowiek.setMiejscowosc("Banino");


        System.out.println("Imie: " + czlowiek.imie);
        System.out.println("Nazwisko: " + czlowiek.nazwisko);
        System.out.println("Wiek: " + czlowiek.wiek);
        System.out.println("Rozmiar buta: " + czlowiek.rozmiar_buta);
        System.out.println("Pesel: " + czlowiek.pesel);
        System.out.println("Miejscowość: " + czlowiek.miejscowosc);
        System.out.println("Ulica: " + czlowiek.ulica);
        System.out.println("Numer domu: " + czlowiek.nr_dom);

    }
}
