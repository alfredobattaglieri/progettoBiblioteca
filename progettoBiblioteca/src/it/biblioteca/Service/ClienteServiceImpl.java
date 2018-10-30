package it.biblioteca.Service;

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
		cliente.setId(id);
		
		input.nextLine();
		return cliente;
	}

		
		

		@Override
		public void affittaLibro(Storia storia, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& storia.getDisponibilit�()>0) {
				System.out.println("inserire giorno e mese in questa modalit�: 7-8");
				storia.setData(input.nextLine());
				storia.setDisponibilit�(storia.getDisponibilit�()-1);
				cliente.getList_libro().add(storia);
			}

		}

		@Override
		public List<Libro> visualizzaTuttiLibri(Biblioteca biblioteca) {
			return biblioteca.getLista_libro();

		}

		@Override
		public List<Horror> visualizzaLibriHorror(Biblioteca biblioteca) {
			return biblioteca.getLista_libro_horror();
		}

		@Override
		public List<Thriller> visualizzaLibriThriller(Biblioteca biblioteca) {
			return biblioteca.getLista_libro_thriller();
		}




		@Override
		public void affittaLibro(Horror horror, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& horror.getDisponibilit�()>0) {
				System.out.println("inserire giorno e mese in questa modalit�: 7-8");
				horror.setData(input.nextLine());
				horror.setDisponibilit�(horror.getDisponibilit�()-1);
				cliente.getList_libro().add(horror);
			}
		}




		@Override
		public void affittaLibro(Romanzo romanzo, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& romanzo.getDisponibilit�()>0) {
				System.out.println("inserire giorno e mese in questa modalit�: 7-8");
				romanzo.setData(input.nextLine());
				romanzo.setDisponibilit�(romanzo.getDisponibilit�()-1);
				cliente.getList_libro().add(romanzo);
			}
			
		}




		@Override
		public void affittaLibro(Thriller thriller, Cliente cliente) {
			System.out.println("inserisci codice cliente  ");
			long codiceCliente= input.nextLong();
			if(codiceCliente==cliente.getIdCodiceCliente()&& thriller.getDisponibilit�()>0) {
				System.out.println("inserire giorno e mese in questa modalit�: 7-8");
				thriller.setData(input.nextLine());
				thriller.setDisponibilit�(thriller.getDisponibilit�()-1);
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
			cliente.getList_libro().get(scelta).setDisponibilit�(cliente.getList_libro().get(scelta).getDisponibilit�()+1);
			
			
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
