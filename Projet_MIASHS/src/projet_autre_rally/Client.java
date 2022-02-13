package projet_autre_rally;

import java.net.*;
import java.io.*;


public class Client {
	public static void main (String[] args) throws UnknownHostException, IOException {
		final String HOST = "87.88.22";
		final int PORT = 8888;
		Socket socket = null;
		try {
			socket = new Socket(HOST,PORT);
			
			// Lecture du flux d'entrée en provenance du serveur
			InputStreamReader reader = new InputStreamReader(socket.getInputStream());
			BufferedReader istream = new BufferedReader(reader);
			String line = istream.readLine();
			
			//Echo la ligne lue vers le serveur
			
			PrintWriter ostream = new PrintWriter(socket.getOutputStream());
			ostream.println(line);
			ostream.flush();
		} catch(IOException e) {}
		finally {
			try {
				socket.close();
				}
			catch(IOException e) {
			}
			}
	
	
	}
}