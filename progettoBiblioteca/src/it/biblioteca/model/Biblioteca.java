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
	ArrayList<Attore> lista_attore;
	ArrayList<Scrittore> lista_scrittori;
	ArrayList<Regista> lista_registi;
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
	
	public ArrayList<Attore> getLista_attore() {
		return lista_attore;
	}
	public void setLista_attore(ArrayList<Attore> lista_attore) {
		this.lista_attore = lista_attore;
	}
	
	public ArrayList<Scrittore> getLista_scrittori() {
		return lista_scrittori;
	}
	public void setLista_scrittori(ArrayList<Scrittore> lista_scrittori) {
		this.lista_scrittori = lista_scrittori;
	}
	
	public ArrayList<Regista> getLista_registi() {
		return lista_registi;
	}
	public void setLista_registi(ArrayList<Regista> lista_registi) {
		this.lista_registi = lista_registi;
	}
	public Biblioteca() {
		super();
	}
	public Biblioteca(String nome, ArrayList<Horror> lista_libro_horror, ArrayList<Thriller> lista_libro_thriller,
			ArrayList<Bibliotecario> list_bibliotecario, ArrayList<Romanzo> lista_libro_romanzo,
			ArrayList<Storia> lista_libro_storia, ArrayList<Cliente> listaCliente, ArrayList<Attore> lista_attore,
			ArrayList<Scrittore> lista_scrittori, ArrayList<Regista> lista_registi) {
		super();
		this.nome = nome;
		this.lista_libro_horror = lista_libro_horror;
		this.lista_libro_thriller = lista_libro_thriller;
		this.list_bibliotecario = list_bibliotecario;
		this.lista_libro_romanzo = lista_libro_romanzo;
		this.lista_libro_storia = lista_libro_storia;
		this.listaCliente = listaCliente;
		this.lista_attore = lista_attore;
		this.lista_scrittori = lista_scrittori;
		this.lista_registi = lista_registi;
	}

	
}
