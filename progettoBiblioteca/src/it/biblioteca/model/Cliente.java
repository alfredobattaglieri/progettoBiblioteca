package it.biblioteca.model;

import java.util.List;

public class Cliente extends Persona{
	long idCodiceCliente;
	List<Libro> list_libro;
	

	
	
	public List<Libro> getList_libro() {
		return list_libro;
	}

	public void setList_libro(List<Libro> list_libro) {
		this.list_libro = list_libro;
	}

	public long getIdCodiceCliente() {
		return idCodiceCliente;
	}

	public void setIdCodiceCliente(long idCodiceCliente) {
		this.idCodiceCliente = idCodiceCliente;
	}

	
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String cognome, int eta) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cliente [idCodiceCliente=" + idCodiceCliente + ", list_libro=" + list_libro + "]";
	}

	
	
}
