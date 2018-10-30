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
	
	public Attore(String nome, String cognome, int eta) {

	}

	@Override
	public String toString() {
		return "Attore [idCodiceAttore=" + idCodiceAttore + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta
				+ "]";
	}
	public long incrementaId(long id) {
		Biblioteca biblioteca=new Biblioteca();
		id=biblioteca.getLista_attore().size()+1;
		return id;
}
}