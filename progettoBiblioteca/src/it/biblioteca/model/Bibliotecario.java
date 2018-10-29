package it.biblioteca.model;

public class Bibliotecario extends Persona{
	long idCodiceBibliotecario;
	
	//Get and Set
	public long getIdCodiceBibliotecario() {
		return idCodiceBibliotecario;
	}

	public void setIdCodiceBibliotecario(long idCodiceBibliotecario) {
		this.idCodiceBibliotecario = idCodiceBibliotecario;
	}
	
	//Costruttore
	public Bibliotecario(long idCodiceBibliotecario) {
		super();
		this.idCodiceBibliotecario = idCodiceBibliotecario;
	}
	
	//to string
	@Override
	public String toString() {
		return "Bibliotecario [idCodiceBibliotecario=" + idCodiceBibliotecario + ", id=" + id + ", nome=" + nome
				+ ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
}
