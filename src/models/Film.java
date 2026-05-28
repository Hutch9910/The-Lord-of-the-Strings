package models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import enums.Generi;

public class Film {

    private int id;
    private String titolo;
    private String regista;
    private int durata;
    private String data;
    private Set<Generi> generi;

    private static int contatore = 0;

    public Film(int id, String titolo, String regista, int durata, String data) {
        this.id = id;
        this.titolo = titolo;
        this.regista = regista;
        this.durata = durata;
        this.data = data;
        setId();
    }

    private void setId() {
        id = ++contatore;
    }

    public void aggiungiGenere(Generi genere) {
        generi.add(genere);
    }

    public boolean isGenere(Generi genere) {
        for (Generi g : generi) {
            if (genere == g) {
                return true;
            }
        }
        return false;
    }

    public void stampaDescrizione() {
        System.out.println("Film [id=" + id + ", titolo=" + titolo + ", regista=" + regista + ", durata=" + durata + ", data="
                + data + ", generi=" + generi + "]");
    }

    public int tempoVita() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate creazione = LocalDate.parse(data, formatter);

        return Period.between(creazione, LocalDate.now()).getYears();
    }
}
