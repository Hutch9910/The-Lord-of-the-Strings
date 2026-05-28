package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public abstract class Proiezione {
	private int id;
	private Film film;
	private Sala sala;
	private LocalDate data;
	private LocalTime oraInizio;
	private double prezzoBase;
	private Set<String> tag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getOraInizio() {
		return oraInizio;
	}
	public void setOraInizio(LocalTime oraInizio) {
		this.oraInizio = oraInizio;
	}
	public double getPrezzoBase() {
		return prezzoBase;
	}
	public void setPrezzoBase(double prezzoBase) {
		this.prezzoBase = prezzoBase;
	}
	public Set<String> getTag() {
		return tag;
	}
	public void setTag(Set<String> tag) {
		this.tag = tag;
	}


	void aggiungiTag(String tag) {
		for(String t: this.getTag()) {
			if (tag.equals(t)) {
				System.out.println("Tag già presente nella lista"); return;
			}
		}
		this.getTag().add(tag);
	}
	
	
	boolean contieneTag(String tag);
	LocalDateTime getDataOraInizio();
	LocalDateTime getDataOraFine();
	boolean isOggi();
	boolean isNelWeekend();
	boolean isSerale();
	boolean isTerminata();
	String getDettagliBase();
	abstract String getTipoProiezione();
}
