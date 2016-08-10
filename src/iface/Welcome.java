package iface;

import java.util.Scanner;

public class Welcome {
	
	private Scanner option;
	private int choice;
	
	public void welcome(){
		System.out.println("===== Bem-vindo ao iFace! =====");
		System.out.println("");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Login");
		System.out.println("");
		
		choice = 0;
		do{
			try{
			System.out.println("Insira a opção desejada");
			option = new Scanner(System.in);
			choice = option.nextInt();
			
			if (choice == 1){
				Register option1 = new Register();
				option1.userRegister();
				welcome();
			}
			} catch(Exception InputMismatchException){
				System.out.println("Por favor, digite 1 ou 2");
			}
			

			 if (choice == 2){
				Login option2 = new Login();
				option2.verifyLogin();
				//Index session = new Index();
				//session.loggedIn(1, 2, 3);
			}
		} while ((choice != 1) && (choice != 2));
	};
}
