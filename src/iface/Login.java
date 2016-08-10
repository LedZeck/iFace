package iface;

import java.util.Scanner;
import java.util.List;

import crud.Crud;
import entities.User;

public class Login {
	private Scanner userLogin;
	private Scanner userPass;
	
	public void verifyLogin(){
		Crud crud = new Crud();
		System.out.println("Digite seu login");
		userLogin = new Scanner(System.in);
		String login = userLogin.next();
		
		System.out.println("Digite sua senha");
		userPass = new Scanner(System.in);
		String pass = userPass.next();	
		
		Index session = new Index();
		session.loggedIn(login);
		
		
	}

}
