package projet_robotrally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* Threads pour une connexion multijoueur
 * 
 */

public class Connexion implements Runnable{
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	private PrintWriter output;

	public Connexion(Socket s) {
		this.s = s;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			out = new PrintWriter(s.getOutputStream());
			} catch(IOException e) {}
		
	}

	@Override
	public void run() {
		try {
			while(true) {
				String line = in.readLine();
				
				/*
				 * Fin de connexion Cliend side
				 */
				if (line == null) {
					break;
				}
				output.println(line);
				out.flush();
				}
			} catch(IOException e) {}
		finally {
			try {
				s.close();
			} catch(IOException e) {
			}
			}
		}

}
