package it.biblioteca.model;

import java.util.List;

public class Thriller extends Libro{
long id;
List<Film> listaThriller;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public List<Film> getListaThriller() {
	return listaThriller;
}
public void setListaThriller(List<Film> listaThriller) {
	this.listaThriller = listaThriller;
}
@Override
public String toString() {
	return "Thriller [id=" + id + ", listaThriller=" + listaThriller + ", titolo=" + titolo + ", autore=" + autore
			+ ", pagine=" + pagine + "]";
}
public Thriller(long id, String titolo, String autore, int pagine, List<Libro> listaLibri, long id2,
		List<Film> listaThriller) {
	super(id, titolo, autore, pagine, listaLibri);
	id = id2;
	this.listaThriller = listaThriller;
}


}
