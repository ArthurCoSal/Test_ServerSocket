package projet_robotrally;

import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) throws IOException{
		int port = 9999;
		ServerSocket server = new ServerSocket(port);
		Socket socket = server.accept();
		
		System.out.println("client connected");
		
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		
		String str = bf.readLine();
		System.out.println("client : "+ str);
	}
}
