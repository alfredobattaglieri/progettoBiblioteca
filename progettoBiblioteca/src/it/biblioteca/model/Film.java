package it.biblioteca.model;

public class Film {
	
	Long id;
	String titolo;
	double durata;
	Genere genere;
	
	public Film(Long id, String titolo, double durata, Genere genere) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.durata = durata;
		this.genere = genere;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public double getDurata() {
		return durata;
	}
	public void setDurata(double durata) {
		this.durata = durata;
	}
	public Genere getGenere() {
		return genere;
	}
	public void setGenere(Genere genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", durata=" + durata + ", genere=" + genere + "]";
	}

	
}
