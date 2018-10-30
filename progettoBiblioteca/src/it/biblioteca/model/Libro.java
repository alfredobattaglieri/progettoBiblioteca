package it.biblioteca.model;

public  abstract class Libro {

	String titolo;
	String autore;
	int pagine;
	int disponibilit�;
	String data;
	String data_prelievo;
	
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
	public int getDisponibilit�() {
		return disponibilit�;
	}
	public void setDisponibilit�(int disponibilit�) {
		this.disponibilit� = disponibilit�;
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
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", disponibilit�="
				+ disponibilit� + ", data=" + data + ", data_prelievo=" + data_prelievo + "]";
	}
	public Libro() {
		super();
	}
}