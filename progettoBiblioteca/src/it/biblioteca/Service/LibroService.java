package it.biblioteca.Service;

import java.util.List;


import it.biblioteca.model.Horror;

import it.biblioteca.model.Thriller;

public interface LibroService {
	
	public void creaLibro(List<Horror> listaLibriHorror, List<Thriller> listaLibriThriller);
	
	public void deleteLibro(Long id);
	
	
	

}
