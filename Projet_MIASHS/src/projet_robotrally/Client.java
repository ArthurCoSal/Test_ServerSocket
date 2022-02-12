package projet_robotrally;

import java.net.*;
import java.io.*;


public class Client {
	public static void main(String[] args) throws IOException{
		String host = "84516626";
		int port = 9999;
		Socket connexion = new Socket(host, port);
		PrintWriter pr = new PrintWriter(connexion.getOutputStream());
		pr.println("Hello World");
		pr.flush();
	}

}
