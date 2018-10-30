package it.biblioteca.model;

import java.util.List;

public class Regista extends Persona{
	long idCodiceRegista;
	List<Film> list_film;
	
	
	
	public List<Film> getList_film() {
		return list_film;
	}

	public void setList_film(List<Film> list_film) {
		this.list_film = list_film;
	}

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

	public Regista() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Regista [idCodiceRegista=" + idCodiceRegista + ", list_film=" + list_film + "]";
	}
	
	//to string
	public long incrementaId(long id) {
		Biblioteca biblioteca=new Biblioteca();
		id=biblioteca.getLista_registi().size()+1;
		return id;	
	}	
}
