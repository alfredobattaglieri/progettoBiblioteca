package it.biblioteca.model;

public class Romanzo extends Libro {

	long id;

	
	//get and set
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
//to string
	@Override
	public String toString() {
		return "Romanzo [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine
				+  "]";
	}
    //costruttore
	public Romanzo(long id) {
		super();
		this.id = id;
	}

	public Romanzo(String titolo, String autore, int pagine, Genere romanzo) {

	}

	
	
	
	
	
	
	
}
