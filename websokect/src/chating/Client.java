package chating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		String name = "ha";
		String ip = "192.168.5.254";
		int port = 7777;
		
		
		try(
				Socket socket = new Socket(ip, port);
				PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true); // true가 autoFlush!
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader keybordInput = new BufferedReader(new InputStreamReader(System.in)); // Scanner랑 같은역할
				
				){
				System.out.println("서버와 연결");
				
				// 받기 전담 알바생 고용해서 일 시작시킨 것
				ClientThread clientThread = new ClientThread(input);
				Thread thread1 = new Thread(clientThread);
				thread1.start();
				
				// 키보드로 입력한 내용을 서버로 계속 보내는 반복문.
				// "ha : 안녕" 이런 형식으로 보내지는 거야.
				String line = null;
				while((line = keybordInput.readLine()) != null) {
		            output.println(name + " :" + line);
		         }
				
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
