package it.biblioteca.model;

public  abstract class Libro {

	
	
	
	long id;
	String titolo;
	String autore;
	int pagine;
	
	//get and setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	//to string
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + "]";
	}
	
	//costruttore
	
	public Libro(long id, String titolo, String autore, int pagine) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
	}
	public Libro() {
		super();
	}
	
	
	
	
	
	
}
