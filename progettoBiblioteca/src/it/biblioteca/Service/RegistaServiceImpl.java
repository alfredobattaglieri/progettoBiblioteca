package it.biblioteca.Service;
import java.util.Scanner;

import it.biblioteca.model.Film;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Regista;
import it.biblioteca.model.Thriller;
public class RegistaServiceImpl implements RegistaService {

	@Override
	public Regista creaRegista() {
		Regista regista = new Regista();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire l'id");
		regista.setIdCodiceRegista(input.nextLong());
		System.out.println("inserire nome e cognome");
		regista.setNome(input.nextLine());
		regista.setCognome(input.nextLine());
		System.out.println("inserisci l'età");
		regista.setEta(input.nextInt());
		return regista;

	}

	@Override
	public Regista visualizzaRegistaCheHaGiratoPiuFilm(Horror horror, Thriller thriller) {
		Regista regista1 = null;
		Regista regista2 = null;
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
		Regista regista1 = null;
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
		Regista regista2 = null;
		for (int j = 0; j < thriller.getList_registaThriller().size(); j++) {
			if (thriller.getList_registaThriller().get(j).getList_film().size() > regista2.getList_film().size()) {
				regista2 = thriller.getList_registaThriller().get(j);
			}

		}
		return regista2;
	}

}
