package it.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	String nome;
	ArrayList<Horror> lista_libro_horror;
	ArrayList<Thriller> lista_libro_thriller;
	ArrayList<Bibliotecario> list_bibliotecario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Libro> getLista_libro() {
		return lista_libro;
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
	public Biblioteca(String nome, ArrayList<Horror> lista_libro_horror, ArrayList<Thriller> lista_libro_thriller,
			ArrayList<Bibliotecario> list_bibliotecario) {
		super();
		this.nome = nome;
		this.lista_libro_horror = lista_libro_horror;
		this.lista_libro_thriller = lista_libro_thriller;
		this.list_bibliotecario = list_bibliotecario;
	}
	
	
	

}
