package it.biblioteca.Service;

import java.util.List;

import it.biblioteca.model.Genere;
import it.biblioteca.model.Libro;

public interface LibroService {
	
	public List<Libro> creaLibro(List<Libro> listaLibri);
	
	public void deleteLibro(Long id);
	
	
	

}
