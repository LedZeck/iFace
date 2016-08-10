package iface;

import java.util.Scanner;

import crud.Crud;
import entities.User;

public class IndexOptions {
	private Scanner option;
	private int choice;
	
	Crud crud = new Crud();
	
	public void showOptions(){
		System.out.println("1 - Criar/Editar Perfil");
		System.out.println("2 - Adicionar amigos");
		System.out.println("3 - Enviar mensagens");
		System.out.println("4 - Criar comunidades");
		System.out.println("5 - Deletar conta");
		
		choice = 0;
		do{
			option = new Scanner(System.in);
			choice = option.nextInt();
			try{
				if (choice <= 4){
					System.out.println("Funcionalidade indisponível nesta versão do iFace.");
					showOptions();
				}			
			}catch(Exception e){
				System.out.println(e);
			}
			
			if (choice == 5){
				User user = crud.buscarId(1);
				crud.removeUser(user);
			}
			
		} while((choice > 1) && (choice <= 5));
		
	}
}
