package iface;

public class Index {
	public void loggedIn(String login){
		System.out.println("Ol�, "+login+"!");
		System.out.println("Voc� ainda n�o tem amigos ou comunidades.");
		System.out.println("Por favor, escolha um das op��es abaixo:");
		
		IndexOptions options = new IndexOptions();
		options.showOptions();
	}

}
