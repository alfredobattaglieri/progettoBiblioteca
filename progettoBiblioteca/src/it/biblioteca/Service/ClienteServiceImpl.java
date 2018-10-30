package it.biblioteca.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import it.biblioteca.model.Biblioteca;
import it.biblioteca.model.Cliente;
import it.biblioteca.model.Horror;
import it.biblioteca.model.Libro;
import it.biblioteca.model.Romanzo;
import it.biblioteca.model.Storia;
import it.biblioteca.model.Thriller;

public class ClienteServiceImpl implements ClienteService {
	Scanner input = new Scanner(System.in);

	@Override
	public Cliente creaCliente(String nome, String cognome, int eta) {
		// TODO Auto-generated method stub
		Biblioteca biblioteca=new Biblioteca();
		Cliente cliente = new Cliente();
		System.out.println("Crea cliente");
		System.out.println("Inserisci nome");
		cliente.setNome(input.nextLine());
		System.out.println("Inserisci cognome");
		cliente.setCognome(input.nextLine());
		System.out.println("Inserisci eta");
		cliente.setEta(input.nextInt());
		input.nextLine();
		long id=cliente.incrementaId(cliente.getIdCodiceCliente());
		cliente.setIdCodiceCliente(id);
		biblioteca.getListaCliente().add(cliente);
		return cliente;
	}

		
		

		@Override
		public void affittaLibro(Storia storia, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& storia.getDisponibilità()>0) {
				System.out.println("inserire giorno e mese in questa modalità: 7-8");
				storia.setData(input.nextLine());
				storia.setDisponibilità(storia.getDisponibilità()-1);
				cliente.getList_libro().add(storia);
			}

		}

		@Override
		public void visualizzaTuttiLibri(Biblioteca biblioteca) {
			List<Libro>list_tot=new ArrayList<>();
			for (int i = 0; i <biblioteca.getLista_libro_horror().size(); i++) {
				list_tot.add(biblioteca.getLista_libro_horror().get(i));
				
			}
			for (int j = 0; j <biblioteca.getLista_libro_thriller().size(); j++) {
				list_tot.add(biblioteca.getLista_libro_thriller().get(j));
			}
			for (int k = 0; k <biblioteca.getLista_libro_romanzo().size(); k++) {
				list_tot.add(biblioteca.getLista_libro_romanzo().get(k));
			}
			for (int z = 0; z <biblioteca.getLista_libro_storia().size(); z++) {
				list_tot.add(biblioteca.getLista_libro_storia().get(z));
			}
			for (int x = 0; x <list_tot.size(); x++) {
			System.out.println(list_tot.toString());
			}
		}

		@Override
		public void visualizzaLibriHorror(Biblioteca biblioteca) {
			for (int i = 0; i <biblioteca.getLista_libro_horror().size(); i++) {
				System.out.println(biblioteca.getLista_libro_horror().get(i));
		}
		}
		@Override
		public void visualizzaLibriThriller(Biblioteca biblioteca) {
			for (int j = 0; j <biblioteca.getLista_libro_thriller().size(); j++) {
				System.out.println(biblioteca.getLista_libro_thriller().get(j));;
			}
		}




		@Override
		public void affittaLibro(Horror horror, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& horror.getDisponibilità()>0) {
				System.out.println("inserire giorno e mese in questa modalità: 7-8");
				horror.setData(input.nextLine());
				horror.setDisponibilità(horror.getDisponibilità()-1);
				cliente.getList_libro().add(horror);
			}
		}




		@Override
		public void affittaLibro(Romanzo romanzo, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& romanzo.getDisponibilità()>0) {
				System.out.println("inserire giorno e mese in questa modalità: 7-8");
				romanzo.setData(input.nextLine());
				romanzo.setDisponibilità(romanzo.getDisponibilità()-1);
				cliente.getList_libro().add(romanzo);
			}
			
		}




		@Override
		public void affittaLibro(Thriller thriller, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& thriller.getDisponibilità()>0) {
				System.out.println("inserire giorno e mese in questa modalità: 7-8");
				thriller.setData(input.nextLine());
				thriller.setDisponibilità(thriller.getDisponibilità()-1);
				cliente.getList_libro().add(thriller);
			}
		}




		@Override
		public void restituisciLibro(Cliente cliente) {
			ClienteServiceImpl cliente1= new ClienteServiceImpl();
			System.out.println("scegliere il libro da restituire");
			for (int i = 0; i < cliente.getList_libro().size(); i++) {
				System.out.println(i);
				System.out.println(cliente.getList_libro().get(i));
			}
			int scelta=input.nextInt();
			System.out.println("inserisci data: 07-08");
			String data_ritorno= input.nextLine();
			int giorno_di_Ritardo=cliente1.controllaData(cliente.getList_libro().get(scelta).getData_prelievo(),data_ritorno);
			if(giorno_di_Ritardo>5) {
				cliente.setGiorniDiRitardo(giorno_di_Ritardo);
			}
			cliente.getList_libro().remove(scelta);
			cliente.getList_libro().get(scelta).setDisponibilità(cliente.getList_libro().get(scelta).getDisponibilità()+1);
			
			
		}




		@Override
		public int controllaData(String data, String data2) {
			 int giorniDiTrattenuta = 0;
			String[] date1= data.split("-");
			int mese=Integer.parseInt(date1[0]);
			int giorno=Integer.parseInt(date1[1]);
			String[]date2=data2.split("-");
			int mese1= Integer.parseInt(date2[0]);
			int giorno1= Integer.parseInt(date2[1]);
			if(mese>=mese1) {
			   giorniDiTrattenuta=giorno1-giorno;
				}
			return giorniDiTrattenuta;
		}
}
