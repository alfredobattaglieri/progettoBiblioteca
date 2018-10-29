package it.biblioteca.model;

import java.util.List;

public class Thriller extends Libro{
long id;
List<Film> listaThriller;
List<Thriller> listaLibriThriller;
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

public List<Thriller> getListaLibriThriller() {
	return listaLibriThriller;
}
public void setListaLibriThriller(List<Thriller> listaLibriThriller) {
	this.listaLibriThriller = listaLibriThriller;
}

@Override
public String toString() {
	return "Thriller [id=" + id + ", listaThriller=" + listaThriller + ", listaLibriThriller=" + listaLibriThriller
			+ ", titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + "]";
}
public Thriller(long id, List<Film> listaThriller, List<Thriller> listaLibriThriller) {
	super();
	this.id = id;
	this.listaThriller = listaThriller;
	this.listaLibriThriller = listaLibriThriller;
}
public Thriller(String titolo, String autore, int pagine, Genere thriller) {

}
}