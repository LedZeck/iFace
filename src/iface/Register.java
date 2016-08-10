package iface;

import crud.Crud;
import entities.User;
import java.util.Scanner;

public class Register {
	private Scanner userLogin;
	private Scanner userName;
	private Scanner userPassword;
	
	
	public void userRegister(){
		Crud crud = new Crud();
		User user = new User();
		System.out.println("Digite seu nome de usuário");
		userLogin = new Scanner(System.in);
		String login = userLogin.next();
		user.setLogin(login);
		
		System.out.println("Digite sua senha");
		userPassword = new Scanner(System.in);
		String password = userPassword.next();
		user.setPassword(password);
		
		System.out.println("Digite seu nome no iFace");
		userName = new Scanner(System.in);
		String name = userName.next();
		user.setName(name);
		
		crud.saveUser(user);
	}

}