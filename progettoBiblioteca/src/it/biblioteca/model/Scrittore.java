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
	
	public Scrittore(String nome, String cognome, int eta) {
	}

	//to string
	@Override
	public String toString() {
		return "Scrittore [idCodiceScrittore=" + idCodiceScrittore  + ", nome=" + nome + ", cognome="
				+ cognome + ", eta=" + eta + "]";
	}
	public long incrementaId(long id) {
		Biblioteca biblioteca=new Biblioteca();
		id=biblioteca.getLista_scrittori().size()+1;
		return id;
}
}