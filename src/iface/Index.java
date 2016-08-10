package iface;

public class Index {
	public void loggedIn(String login){
		System.out.println("Olá, "+login+"!");
		System.out.println("Você ainda não tem amigos ou comunidades.");
		System.out.println("Por favor, escolha um das opções abaixo:");
		
		IndexOptions options = new IndexOptions();
		options.showOptions();
	}

}
