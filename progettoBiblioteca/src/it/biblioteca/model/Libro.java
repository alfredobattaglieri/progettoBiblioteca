package it.biblioteca.model;

import java.util.List;

public  abstract class Libro {

	String titolo;
	String autore;
	int pagine;
	List<Libro> listaLibri;
	//get and setters
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	
	public List<Libro> getListaLibri() {
		return listaLibri;
	}
	public void setListaLibri(List<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}
	
	
	//costruttore
	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", listaLibri="
				+ listaLibri + "]";
	}


	public Libro() {
		super();
	}
	
	
	
	
	
	
}
