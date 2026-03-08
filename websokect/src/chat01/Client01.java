package chat01;

import java.io.IOException;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
//		ip, port
		
		String serverId = "192.168.161.245";
		int port = 1100;
		Scanner sc = new Scanner(System.in);
		
		try(
				Socket socket = new Socket(serverId, port); // 서버에 연결 요청
				PrintWriter writer = new PrintWriter(socket.getOutputStream()); // 보내는 발송
		){
				System.out.println("서버가 연결되었습니다.");
				
				String message = sc.nextLine(); // 키보드로 입력
				writer.println(message); // 서버로 전송
				
				
				System.out.println("서버로 [" + message + "] 를 전송하였습니다.");
				
			} catch (IOException e) {
				e.printStackTrace();
		}
		
	}
	
}
