package models;

import java.time.LocalDate;
import java.util.Set;

import enums.Generi;

public class Film {

    private int id;
    private String titolo;
    private String regista;
    private int durata;
    private String data;
    private Set<Generi> generi;

    private static int contatore;

    public Film(int id, String titolo, String regista, int durata, String data) {
        this.id = id;
        this.titolo = titolo;
        this.regista = regista;
        this.durata = durata;
        this.data = data;
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

    // public int tempoVita() {
    //     LocalDate annoCorrente = LocalDate.now().getYear();

    //     int[] dataDivisa = new int[3];

    //     dataDivisa = data.split("-"); // solo



    //     int tempoVita = annoCorrente - dataDivisa[2];
    // }
}
