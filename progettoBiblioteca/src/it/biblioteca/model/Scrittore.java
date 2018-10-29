package it.biblioteca.model;

public class Scrittore extends Persona{
	long idCodiceScrittore;
	
	//Get and Set
	public long getIdCodiceScrittore() {
		return idCodiceScrittore;
	}

	public void setIdCodiceScrittore(long idCodiceScrittore) {
		this.idCodiceScrittore = idCodiceScrittore;
	}
	
	//Costruttore
	public Scrittore(long idCodiceScrittore) {
		super();
		this.idCodiceScrittore = idCodiceScrittore;
	}
	
	//to string
	@Override
	public String toString() {
		return "Scrittore [idCodiceScrittore=" + idCodiceScrittore + ", id=" + id + ", nome=" + nome + ", cognome="
				+ cognome + ", eta=" + eta + "]";
	}

}
