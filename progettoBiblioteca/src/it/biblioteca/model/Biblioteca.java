package it.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	String nome;
	ArrayList<Horror> lista_libro_horror;
	ArrayList<Thriller> lista_libro_thriller;
	ArrayList<Bibliotecario> list_bibliotecario;
	ArrayList<Romanzo> lista_libro_romanzo;
	ArrayList<Storia> lista_libro_storia;
	ArrayList<Cliente> cliente;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Libro> getLista_libro() {
		return getLista_libro();
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
	public ArrayList<Bibliotecario> getList_bibliotecario() {
		return list_bibliotecario;
	}
	public void setList_bibliotecario(ArrayList<Bibliotecario> list_bibliotecario) {
		this.list_bibliotecario = list_bibliotecario;
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

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}
	public Biblioteca(String nome, ArrayList<Libro> lista_libro_horror, ArrayList<Libro> lista_libro_thriller,
			ArrayList<Bibliotecario> list_bibliotecario) {
	}


	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + ", lista_libro_horror=" + lista_libro_horror + ", lista_libro_thriller="
				+ lista_libro_thriller + ", list_bibliotecario=" + list_bibliotecario + ", lista_libro_romanzo="
				+ lista_libro_romanzo + ", lista_libro_storia=" + lista_libro_storia + ", cliente=" + cliente + "]";
	}

	public Biblioteca(String nome, ArrayList<Horror> lista_libro_horror, ArrayList<Thriller> lista_libro_thriller,
			ArrayList<Bibliotecario> list_bibliotecario, ArrayList<Romanzo> lista_libro_romanzo,
			ArrayList<Storia> lista_libro_storia, ArrayList<Cliente> cliente) {
		super();
		this.nome = nome;
		this.lista_libro_horror = lista_libro_horror;
		this.lista_libro_thriller = lista_libro_thriller;
		this.list_bibliotecario = list_bibliotecario;
		this.lista_libro_romanzo = lista_libro_romanzo;
		this.lista_libro_storia = lista_libro_storia;
		this.cliente = cliente;
	}
	public Biblioteca(String nome) {
		super();
		this.nome = nome;
	}

	public Long incrementaId(long id) {
		id=id+1;
		return id;
	}
	

}
