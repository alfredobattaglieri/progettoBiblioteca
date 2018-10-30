package progettoBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import it.biblioteca.Service.ClienteService;
import it.biblioteca.Service.FilmService;
import it.biblioteca.Service.FilmServiceImpl;
import it.biblioteca.Service.LibroService;
import it.biblioteca.Service.LibroServiceimpl;
import it.biblioteca.Service.RegistaServiceImpl;
import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Bibliotecario;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Film;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Regista;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;
import it.biblioteca.model.Horror;


public class runner extends LibroServiceimpl{

	public static void main(String[] args) {
		Scanner input=new java.util.Scanner(System.in);
		boolean trovata = true;
		ArrayList<Bibliotecario> lista_bibliotecario=new ArrayList<>();
		ArrayList<Horror> list_libro_horror=new ArrayList<>();
		ArrayList<Thriller> list_libro_thriller=new ArrayList<>();
		ArrayList<Romanzo> list_libro_romanzo=new ArrayList<>();
		ArrayList<Storia> list_libro_storia=new ArrayList<>();
		Biblioteca biblioteca=new Biblioteca("LibriPerTutti");
		biblioteca.setLista_libro_horror(list_libro_horror);
		biblioteca.setLista_libro_thriller(list_libro_thriller);
		biblioteca.setLista_libro_romanzo(list_libro_romanzo);
		biblioteca.setLista_libro_storia(list_libro_storia);
		
		do {
			System.out.println("1-Crea Libro\n2-Crea Film\n3-VisualizzaLibroIspiratoPiuFilm\n4-Crea Regista e Associa Film a Regista\n5-Elimina Libro\n6-Fine\nFai la tua scelta:");
			int scelta = input.nextInt();
			//LibroService libro = null;
			FilmServiceImpl film=new FilmServiceImpl();
			LibroServiceimpl libro=new LibroServiceimpl();
			RegistaServiceImpl regista= new RegistaServiceImpl();
			Horror horror= new Horror();
			Thriller thriller=new Thriller();
			switch(scelta) {
				case 1:
					System.out.println(biblioteca);
					libro.creaLibro(biblioteca);
					break;
				case 2:
					film.creaFilm(biblioteca);
					break;
				case 3:
					film.visualizzaLibroIspiratoPiuFilm(biblioteca);
					break;
				case 4:
					Regista regista1= regista.creaRegista();
					Film film1=film.scegliFilm(horror, thriller);
					break;
				case 5:
					libro.deleteLibro(biblioteca);
					break;
				case 6:
					System.out.println("Arrivederci ;)");
					trovata = false;
					break;
				default:
					System.out.println("Nessuna corrispondenza trovata!");
			}
			
		}while(trovata);
		

	}

}
