package it.biblioteca.model;

public  abstract class Libro {
	
	long idCodiceLibro;
	String titolo;
	String autore;
	int pagine;
	int disponibilità;
	String data;
	String data_prelievo;
	
	public long getIdCodiceLibro() {
		return idCodiceLibro;
	}
	public void setIdCodiceLibro(long idCodiceLibro) {
		this.idCodiceLibro = idCodiceLibro;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData_prelievo() {
		return data_prelievo;
	}
	public void setData_prelievo(String data_prelievo) {
		this.data_prelievo = data_prelievo;
	}
	public int getDisponibilità() {
		return disponibilità;
	}
	public void setDisponibilità(int disponibilità) {
		this.disponibilità = disponibilità;
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
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", disponibilità="
				+ disponibilità + ", data=" + data + ", data_prelievo=" + data_prelievo + "]";
	}
	public Libro() {
		super();
	}
	
	public long incrementaId(long id) {
		Biblioteca biblioteca=new Biblioteca();
		id=biblioteca.getListaLibri().size()+1;
		return id;
	}

}