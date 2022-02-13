package projet_robotrally;

import java.net.*;
import java.io.*;
import java.lang.Thread;

public class Server {
	public static void main (String[] args) throws IOException {
	final int port = 8888;
	try {
		ServerSocket server = new ServerSocket(port,5);
		while(true) {
			//acceptation d'une connexion
			
			Socket socket = server.accept();
			
			/* Comment créer un Thread : échange des données entre client/serveur
			 * 
			 */
			
			Connexion c = new Connexion(socket);
			Thread processus_connexion = new Thread(c);
			processus_connexion.start();
			
			}
	} catch (IOException e) {
	}
	
	
	}
	
}