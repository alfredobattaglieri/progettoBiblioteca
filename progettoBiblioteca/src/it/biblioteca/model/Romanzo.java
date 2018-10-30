package it.biblioteca.model;

import java.util.List;

public class Romanzo extends Libro {

	long id;
	List<Film> listaRomanzo;
	List<Romanzo> listaLibriRomanzo;
	List<Regista> list_registiRomanzo;
	
	//get and set
	 public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public List<Film> getListaRomanzo() {
			return listaRomanzo;
		}
		public void setListaRomanzo(List<Film> listaRomanzo) {
			this.listaRomanzo = listaRomanzo;
		}
		public List<Romanzo> getListaLibriRomanzo() {
			return listaLibriRomanzo;
		}
		public void setListaLibriRomanzo(List<Romanzo> listaLibriRomanzo) {
			this.listaLibriRomanzo = listaLibriRomanzo;
		}
		public List<Regista> getList_registiRomanzo() {
			return list_registiRomanzo;
		}
		public void setList_registiRomanzo(List<Regista> list_registiRomanzo) {
			this.list_registiRomanzo = list_registiRomanzo;
		}
		
		//to string
		@Override
		public String toString() {
			return "Romanzo [id=" + id + ", listaRomanzo=" + listaRomanzo + ", listaLibriRomanzo=" + listaLibriRomanzo
					+ ", list_registiRomanzo=" + list_registiRomanzo + "]";
		}
		
		//costruttore
		public Romanzo(long id, List<Film> listaRomanzo, List<Romanzo> listaLibriRomanzo,
				List<Regista> list_registiRomanzo) {
			super();
			this.id = id;
			this.listaRomanzo = listaRomanzo;
			this.listaLibriRomanzo = listaLibriRomanzo;
			this.list_registiRomanzo = list_registiRomanzo;
		}
		public Romanzo(String titolo, String autore, int pagine, String romanzo) {

		}	
}
