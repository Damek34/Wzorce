public class Czlowiek {
    String imie;
    String nazwisko;
    int wiek;
    int rozmiar_buta ;
    int pesel;
    String miejscowosc;
    String ulica;
    int nr_dom;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setRozmiar_buta(int rozmiar_buta) {
        this.rozmiar_buta = rozmiar_buta;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNr_domu(int nr_dom) {
        this.nr_dom = nr_dom;
    }

    public void wyswietl() {
        if (imie != null) {
            System.out.println("Imie: " + imie);
        }

        if (nazwisko != null) {
            System.out.println("Nazwisko: " + nazwisko);
        }

        if (wiek > 0) {
            System.out.println("Wiek: " + wiek);
        }

        if (rozmiar_buta > 0) {
            System.out.println("Rozmiar buta: " + rozmiar_buta);
        }

        if (pesel > 0) {
            System.out.println("Pesel: " + pesel);
        }

        if (miejscowosc != null) {
            System.out.println("Miejscowość: " + miejscowosc);
        }

        if (ulica != null) {
            System.out.println("Ulica: " + ulica);
        }

        if (nr_dom > 0) {
            System.out.println("Numer domu: " + nr_dom);
        }


    }
}
