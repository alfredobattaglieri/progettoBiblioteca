package progettoBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import it.biblioteca.Service.ClienteService;
import it.biblioteca.Service.FilmService;
import it.biblioteca.Service.FilmServiceImpl;
import it.biblioteca.Service.LibroService;
import it.biblioteca.Service.LibroServiceimpl;
import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Bibliotecario;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Thriller;
import it.biblioteca.model.Horror;


public class runner extends LibroServiceimpl{

	public static void main(String[] args) {
		Scanner input=new java.util.Scanner(System.in);
		boolean trovata = true;
		ArrayList<Bibliotecario> lista_bibliotecario=new ArrayList<>();
		ArrayList<Horror> list_libro_horror=new ArrayList<>();
		ArrayList<Thriller> list_libro_thriller=new ArrayList<>();
		Biblioteca biblioteca=new Biblioteca("LibriPerTutti",list_libro_horror,list_libro_thriller,lista_bibliotecario);
		
		do {
			System.out.println("1-Crea Libro\n2-Crea Film\n3-VisualizzaLibroIspiratoPiuFilm\n4-Fine\nFai la tua scelta:");
			int scelta = input.nextInt();
			//LibroService libro = null;
			FilmServiceImpl film=new FilmServiceImpl();
			LibroServiceimpl libro=new LibroServiceimpl();
			
			switch(scelta) {
				case 1:
					libro.creaLibro();
					break;
				case 2:
					film.creaFilm();
					break;
				case 3:
					film.visualizzaLibroIspiratoPiuFilm(biblioteca);
					break;
				case 4:
					System.out.println("Arrivederci ;)");
					trovata = false;
					break;
				default:
					System.out.println("Nessuna corrispondenza trovata!");
			}
		}while(trovata);
		

	}

}
