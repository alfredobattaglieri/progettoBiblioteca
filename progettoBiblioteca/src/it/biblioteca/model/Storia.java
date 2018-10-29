package it.biblioteca.model;

public class Storia  extends Libro{
	long id;
//get and set
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
// to string
	@Override
	public String toString() {
		return "Storia [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", listaLibri="
				+ listaLibri + "]";
	}
//costruttore
	public Storia(long id) {
		super();
		this.id = id;
	}

	public Storia(String titolo, String autore, int pagine, Genere storia) {

	}

	
	

}
