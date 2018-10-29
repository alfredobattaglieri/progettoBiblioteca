package it.biblioteca.model;

public class Regista extends Persona{
	long idCodiceRegista;
	
	//Get and Set
	public long getIdCodiceRegista() {
		return idCodiceRegista;
	}

	public void setIdCodiceRegista(long idCodiceRegista) {
		this.idCodiceRegista = idCodiceRegista;
	}
	
	//Costruttore
	public Regista(long idCodiceRegista) {
		super();
		this.idCodiceRegista = idCodiceRegista;
	}
	
	//to string
	@Override
	public String toString() {
		return "Regista [idCodiceRegista=" + idCodiceRegista + ", id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+ ", eta=" + eta + "]";
	}
	
}
