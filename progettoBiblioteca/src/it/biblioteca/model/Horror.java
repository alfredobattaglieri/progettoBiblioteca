package it.biblioteca.model;

import java.util.List;

public class Horror extends Libro{
long id;
List<Film> listaHorror;
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

@Override
public String toString() {
	return "Horror [id=" + id + ", listaHorror=" + listaHorror + ", titolo=" + titolo + ", autore=" + autore
			+ ", pagine=" + pagine + "]";
}


public Horror(long id, List<Film> listaHorror) {
	super();
	this.id = id;
	this.listaHorror = listaHorror;
}

}
