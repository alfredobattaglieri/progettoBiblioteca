package it.biblioteca.model;

import java.util.List;

public class Storia  extends Libro{
	long id;
	List<Film> listaStoria;
	List<Storia> listaLibriStoria;
	List<Regista> list_registiStoria;
	
	//get and set
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Film> getListaStoria() {
		return listaStoria;
	}
	public void setListaStoria(List<Film> listaStoria) {
		this.listaStoria = listaStoria;
	}
	public List<Storia> getListaLibriStoria() {
		return listaLibriStoria;
	}
	public void setListaLibriStoria(List<Storia> listaLibriStoria) {
		this.listaLibriStoria = listaLibriStoria;
	}
	public List<Regista> getList_registiStoria() {
		return list_registiStoria;
	}
	public void setList_registiStoria(List<Regista> list_registiStoria) {
		this.list_registiStoria = list_registiStoria;
	}

	// to string
	@Override
	public String toString() {
		return "Storia [id=" + id + ", listaStoria=" + listaStoria + ", listaLibriStoria=" + listaLibriStoria
				+ ", list_registiStoria=" + list_registiStoria + "]";
	}
	//costruttore
	public Storia(long id, List<Film> listaStoria, List<Storia> listaLibriStoria, List<Regista> list_registiStoria) {
		super();
		this.id = id;
		this.listaStoria = listaStoria;
		this.listaLibriStoria = listaLibriStoria;
		this.list_registiStoria = list_registiStoria;
	}
	
	public Storia(String titolo, String autore, int pagine, String storia) {

	}
	
}
