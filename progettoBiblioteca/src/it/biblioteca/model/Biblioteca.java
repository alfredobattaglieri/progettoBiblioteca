package it.biblioteca.model;

import java.util.ArrayList;

public class Biblioteca {

	String nome;
	ArrayList<Horror> lista_libro_horror;
	ArrayList<Thriller> lista_libro_thriller;
	ArrayList<Bibliotecario> list_bibliotecario;
	ArrayList<Romanzo> lista_libro_romanzo;
	ArrayList<Storia> lista_libro_storia;
	ArrayList<Cliente> listaCliente;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Horror> getLista_libro_horror() {
		return lista_libro_horror;
	}
	public void setLista_libro_horror(ArrayList<Horror> lista_libro_horror) {
		this.lista_libro_horror = lista_libro_horror;
	}
	public ArrayList<Thriller> getLista_libro_thriller() {
		return lista_libro_thriller;
	}
	public void setLista_libro_thriller(ArrayList<Thriller> lista_libro_thriller) {
		this.lista_libro_thriller = lista_libro_thriller;
	}
	public ArrayList<Bibliotecario> getList_bibliotecario() {
		return list_bibliotecario;
	}
	public void setList_bibliotecario(ArrayList<Bibliotecario> list_bibliotecario) {
		this.list_bibliotecario = list_bibliotecario;
	}
	public ArrayList<Romanzo> getLista_libro_romanzo() {
		return lista_libro_romanzo;
	}
	public void setLista_libro_romanzo(ArrayList<Romanzo> lista_libro_romanzo) {
		this.lista_libro_romanzo = lista_libro_romanzo;
	}
	public ArrayList<Storia> getLista_libro_storia() {
		return lista_libro_storia;
	}
	public void setLista_libro_storia(ArrayList<Storia> lista_libro_storia) {
		this.lista_libro_storia = lista_libro_storia;
	}
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	public Biblioteca(String nome, ArrayList<Horror> lista_libro_horror, ArrayList<Thriller> lista_libro_thriller,
			ArrayList<Bibliotecario> list_bibliotecario, ArrayList<Romanzo> lista_libro_romanzo,
			ArrayList<Storia> lista_libro_storia, ArrayList<Cliente> listaCliente) {
		super();
		this.nome = nome;
		this.lista_libro_horror = lista_libro_horror;
		this.lista_libro_thriller = lista_libro_thriller;
		this.list_bibliotecario = list_bibliotecario;
		this.lista_libro_romanzo = lista_libro_romanzo;
		this.lista_libro_storia = lista_libro_storia;
		this.listaCliente = listaCliente;
	}
	public Biblioteca() {
		super();
	}
	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + ", lista_libro_horror=" + lista_libro_horror + ", lista_libro_thriller="
				+ lista_libro_thriller + ", list_bibliotecario=" + list_bibliotecario + ", lista_libro_romanzo="
				+ lista_libro_romanzo + ", lista_libro_storia=" + lista_libro_storia + ", listaCliente=" + listaCliente
				+ "]";
	}


}
