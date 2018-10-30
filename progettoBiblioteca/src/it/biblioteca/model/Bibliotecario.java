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
	
	public Bibliotecario() {
		// TODO Auto-generated constructor stub
	}

	//to string
	@Override
	public String toString() {
		return "Bibliotecario [idCodiceBibliotecario=" + idCodiceBibliotecario + ", id=" + idCodiceBibliotecario + ", nome=" + nome
				+ ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	public long incrementaId(long id) {
		Biblioteca biblioteca=new Biblioteca();
		id=biblioteca.getList_bibliotecario().size()+1;
		return id;
}
}