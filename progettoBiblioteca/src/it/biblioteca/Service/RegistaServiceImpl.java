package it.biblioteca.Service;



import java.util.Scanner;

import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Film;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Regista;
import it.biblioteca.model.Thriller;
public class RegistaServiceImpl implements RegistaService {
	Scanner input = new Scanner(System.in);
	@Override
	public Regista creaRegista(Biblioteca biblioteca) {
		Regista regista = new Regista();
		long id=regista.incrementaId(regista.getIdCodiceRegista());
		regista.setIdCodiceRegista(id);
		System.out.println("inserire nome");
		regista.setNome(input.nextLine());
		System.out.println("cognome");
		regista.setCognome(input.nextLine());
		System.out.println("inserisci l'età");
		regista.setEta(input.nextInt());
		biblioteca.getLista_registi().add(regista);
		return regista;

	}

	@Override
	public Regista visualizzaRegistaCheHaGiratoPiuFilm(Horror horror, Thriller thriller) {
		Regista regista1 = new Regista();
		Regista regista2 = new Regista();
		for (int i = 0; i < horror.getList_registiHorror().size(); i++) {
			if (horror.getList_registiHorror().get(i).getList_film().size() > regista1.getList_film().size()) {
				regista1 = horror.getList_registiHorror().get(i);
			}

			for (int j = 0; j < thriller.getList_registaThriller().size(); j++) {
				if (thriller.getList_registaThriller().get(j).getList_film().size() > regista2.getList_film().size()) {
					regista2 = thriller.getList_registaThriller().get(j);
				}

			}

		}

		if (regista1.getList_film().size() > regista2.getList_film().size()) {
			return regista1;
		}

		else {
			return regista2;
		}

	}

	@Override
	public Regista visualizzaRegistaCheHaGiratoPiuFilmGenere(Horror horror) {
		Regista regista1 = new Regista();
		for (int i = 0; i < horror.getList_registiHorror().size(); i++) {
			if (horror.getList_registiHorror().get(i).getList_film().size() > regista1.getList_film().size()) {
				regista1 = horror.getList_registiHorror().get(i);
			}
		}
		return regista1;
	}

	@Override
	public void associaFilm(Regista regista, Film film) {

	}

	@Override
	public Regista visualizzaRegistaCheHaGiratoPiuFilmGenere(Thriller thriller) {
		Regista regista2 = new Regista();
		for (int j = 0; j < thriller.getList_registaThriller().size(); j++) {
			if (thriller.getList_registaThriller().get(j).getList_film().size() > regista2.getList_film().size()) {
				regista2 = thriller.getList_registaThriller().get(j);
			}

		}
		return regista2;
	}

	@Override
	public void associaRegistaHorror(Horror horror,Regista regista) {
		horror.getList_registiHorror().add(regista);
		
	}

	@Override
	public void associaRegistaThriller(Thriller thriller, Regista regista) {
		thriller.getList_registaThriller().add(regista);
		
	}
	



}
