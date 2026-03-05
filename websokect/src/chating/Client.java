package chating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		String name = "hayoung";
		String ip = "192.168.5.254";
		int port = 7777;
		
		try(
				Socket socket = new Socket(ip, port);
				PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader keybordInput = new BufferedReader(new InputStreamReader(System.in));
				
				){
				System.out.println("서버와 연결");
				
				ClientThread clientThread = new ClientThread(input);
				Thread thread1 = new Thread(clientThread);
				thread1.start();
				
				String line = null;
				while((line = keybordInput.readLine()) != null) {
		            output.println(name + " :" + line);
		         }
				
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
