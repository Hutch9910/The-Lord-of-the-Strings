package models;

import java.util.HashSet;
import java.util.Set;

import enums.Caratteristiche;

public class Sala {

	//proprietà
	private int id;
	private String nome;
	private int capienza;
	private boolean supporto3D;
	private Set<Caratteristiche> caratteristiche = new HashSet<>();
	
	private static int contatore;

	//costruttore
	public Sala(int id, String nome, int capienza, boolean supporto3d, Set<Caratteristiche> caratteristiche) {
		super();
		this.id = id;
		this.nome = nome;
		this.capienza = capienza;
		supporto3D = supporto3d;
		this.caratteristiche = caratteristiche;
	}

	//getter e setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public boolean isSupporto3D() {
		return supporto3D;
	}

	public void setSupporto3D(boolean supporto3d) {
		supporto3D = supporto3d;
	}

	public Set<Caratteristiche> getCaratteristiche() {
		return caratteristiche;
	}

	public void setCaratteristiche(Set<Caratteristiche> caratteristiche) {
		this.caratteristiche = caratteristiche;
	}

	public static int getContatore() {
		return contatore;
	}

	public static void setContatore(int contatore) {
		Sala.contatore = contatore;
	}
	
	//metodi
	public void aggiungiCaratteristica(Caratteristiche caratteristica) {
	    if (caratteristica == null) {
	        System.out.println("Errore: la caratteristica non può essere nullo.");
	        return;
	    }
	    caratteristiche.add(caratteristica);
	}
	
	public boolean hasCaratteristica(Caratteristiche caratteristica) {
	    return caratteristiche.contains(caratteristica);
	}
	
	public void stampaDescrizione()
	{
		System.out.println("Nome sala: "+nome+" Capienza:"+capienza+" Supporto3d: "+supporto3D+"Caratteristiche :"+caratteristiche);
	}
}
