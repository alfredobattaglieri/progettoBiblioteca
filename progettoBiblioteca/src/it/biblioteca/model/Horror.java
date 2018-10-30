package it.biblioteca.model;

import java.util.List;

public class Horror extends Libro{
long id;
List<Film> listaHorror;
List<Horror> listaLibriHorror;
List<Regista> list_registiHorror;



public List<Regista> getList_registiHorror() {
	return list_registiHorror;
}
public void setList_registiHorror(List<Regista> list_registiHorror) {
	this.list_registiHorror = list_registiHorror;
}
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



public Horror(long id, List<Film> listaHorror) {
	super();
	this.id = id;
	this.listaHorror = listaHorror;
}

public Horror(String titolo, String autore, int pagine, String horror) {

}

@Override
public String toString() {
	return "Horror [id=" + id + ", listaHorror=" + listaHorror + ", listaLibriHorror=" + listaLibriHorror
			+ ", list_registiHorror=" + list_registiHorror + "]";
}
public Horror() {
	super();
}



}
