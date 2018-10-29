package it.biblioteca.model;

public class Attore extends Persona{
	long idCodiceAttore;
	
	//Get and Set
	public long getIdCodiceAttore() {
		return idCodiceAttore;
	}

	public void setIdCodiceAttore(long idCodiceAttore) {
		this.idCodiceAttore = idCodiceAttore;
	}
	
	//Costruttore
	public Attore(long idCodiceAttore) {
		super();
		this.idCodiceAttore = idCodiceAttore;
	}
	
	//to string
	@Override
	public String toString() {
		return "Attore [idCodiceAttore=" + idCodiceAttore + ", id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+ ", eta=" + eta + "]";
	}
	
}
