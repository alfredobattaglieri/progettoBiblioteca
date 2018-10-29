package it.biblioteca.model;

import java.util.List;

public class Horror extends Libro{
long id;
List<Film> listaHorror;
List<Horror> listaLibriHorror;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public List<Film> getListaHorror() {
	return listaHorror;
}
public void setListaHorror(List<Film> listaHorror) {
	this.listaHorror = listaHorror;
}

public List<Horror> getListaLibriHorror() {
	return listaLibriHorror;
}
public void setListaLibriHorror(List<Horror> listaLibriHorror) {
	this.listaLibriHorror = listaLibriHorror;
}

@Override
public String toString() {
	return "Horror [id=" + id + ", listaHorror=" + listaHorror + ", listaLibriHorror=" + listaLibriHorror + ", titolo="
			+ titolo + ", autore=" + autore + ", pagine=" + pagine  + "]";
}
public Horror(long id, List<Film> listaHorror) {
	super();
	this.id = id;
	this.listaHorror = listaHorror;
}

public Horror(String titolo, String autore, int pagine, Genere horror) {

}

}
