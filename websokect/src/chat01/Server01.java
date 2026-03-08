package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
		
		String message = null;
		System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
		try(
				ServerSocket serverSocket = new ServerSocket(1100); // 문열고 대기
				Socket socket = serverSocket.accept(); // 전화올때까지 기다림
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 날것을 한줄씩 읽기 편하게 포장
				
			){
			
				System.out.println("클라이언트가 연결 되었습니다.");
				
				message = bufferedReader.readLine(); // 한 번만 받음.
				System.out.println("클라이언트로 부터 온 메세지" + message);
			
			
			
			
			
			
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
		
	}

}
